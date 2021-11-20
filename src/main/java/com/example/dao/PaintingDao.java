package com.example.dao;

import com.example.entity.Painting;
import com.example.entity.PaintingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaintingDao {
    long countByExample(PaintingExample example);

    int deleteByExample(PaintingExample example);

    int deleteByPrimaryKey(Integer paintingId);

    int insert(Painting record);

    int insertSelective(Painting record);

    List<Painting> selectByExample(PaintingExample example);

    Painting selectByPrimaryKey(Integer paintingId);

    int updateByExampleSelective(@Param("record") Painting record, @Param("example") PaintingExample example);

    int updateByExample(@Param("record") Painting record, @Param("example") PaintingExample example);

    int updateByPrimaryKeySelective(Painting record);

    int updateByPrimaryKey(Painting record);
}