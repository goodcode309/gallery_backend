//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.PaintingDao;
import com.example.entity.Painting;
import com.example.entity.PaintingExample;
import com.example.entity.PolarwkProperties;
import com.example.service.PaintingService;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaintingServiceImpl implements PaintingService {
    @Autowired
    private PaintingDao paintingDao;
    @Autowired
    private PolarwkProperties polarwkProperties;
    private PaintingExample paintingExample = new PaintingExample();

    public PaintingServiceImpl() {
    }

    public String getAllPaintings() {
        JSONObject jsonObject = new JSONObject();
        this.paintingExample.createCriteria().andPaintingIdIsNotNull();
        List<Painting> paintings = this.paintingDao.selectByExample(this.paintingExample);
        Iterator var3 = paintings.iterator();

        while(var3.hasNext()) {
            Painting painting = (Painting)var3.next();
            painting.setPaintingPath(this.polarwkProperties.getRemoteAddress() + painting.getPaintingPath());
        }

        try {
            jsonObject.put("result", true);
            jsonObject.put("message", "获取成功");
            jsonObject.put("paintings", paintings);
            return jsonObject.toString();
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
            return jsonObject.toString();
        }
    }
}
