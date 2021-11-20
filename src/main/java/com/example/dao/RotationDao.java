package com.example.dao;

import com.example.entity.Rotation;
import com.example.entity.RotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RotationDao {
    long countByExample(RotationExample example);

    int deleteByExample(RotationExample example);

    int deleteByPrimaryKey(Integer rotationId);

    int insert(Rotation record);

    int insertSelective(Rotation record);

    List<Rotation> selectByExample(RotationExample example);

    Rotation selectByPrimaryKey(Integer rotationId);

    int updateByExampleSelective(@Param("record") Rotation record, @Param("example") RotationExample example);

    int updateByExample(@Param("record") Rotation record, @Param("example") RotationExample example);

    int updateByPrimaryKeySelective(Rotation record);

    int updateByPrimaryKey(Rotation record);
}
