package com.example.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.InstructionDao;
import com.example.entity.Instruction;
import com.example.entity.InstructionExample;
import com.example.service.InstructionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructionServiceImpl implements InstructionService {
    @Autowired
    private InstructionDao instructionDao;

    public InstructionServiceImpl() {
    }

    public String getInstruction(Integer paintingId) {
        InstructionExample instructionsExample = new InstructionExample();
        instructionsExample.createCriteria().andPaintingIdEqualTo(paintingId);
        List<Instruction> instructions = this.instructionDao.selectByExample(instructionsExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", true);
        jsonObject.put("message", "获取成功");
        jsonObject.put("instruction", instructions);
        return jsonObject.toJSONString();
    }
}
