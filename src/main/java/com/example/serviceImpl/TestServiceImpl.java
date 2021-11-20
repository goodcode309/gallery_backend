package com.example.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.PaintingDao;
import com.example.entity.Painting;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private PaintingDao paintingDao;


    @Override
    public String getOnePainting(Integer paintingId) {
        JSONObject jsonObject = new JSONObject();
        Painting painting = this.paintingDao.selectByPrimaryKey(paintingId);
        jsonObject.put("painting",painting.getPaintingName());
        return jsonObject.toString();
    }
}
