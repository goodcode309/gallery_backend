package com.example.dao;

import com.example.entity.Instruction;
import com.example.entity.InstructionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstructionDao {
    long countByExample(InstructionExample example);

    int deleteByExample(InstructionExample example);

    int deleteByPrimaryKey(Integer instructionId);

    int insert(Instruction record);

    int insertSelective(Instruction record);

    List<Instruction> selectByExample(InstructionExample example);

    Instruction selectByPrimaryKey(Integer instructionId);

    int updateByExampleSelective(@Param("record") Instruction record, @Param("example") InstructionExample example);

    int updateByExample(@Param("record") Instruction record, @Param("example") InstructionExample example);

    int updateByPrimaryKeySelective(Instruction record);

    int updateByPrimaryKey(Instruction record);
}