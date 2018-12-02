package com.airline.dao;

import com.airline.bean.Plane;
import com.airline.bean.PlaneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaneMapper {
    long countByExample(PlaneExample example);

    int deleteByExample(PlaneExample example);

    int deleteByPrimaryKey(Integer planeid);

    int insert(Plane record);

    int insertSelective(Plane record);

    List<Plane> selectByExample(PlaneExample example);

    Plane selectByPrimaryKey(Integer planeid);

    int updateByExampleSelective(@Param("record") Plane record, @Param("example") PlaneExample example);

    int updateByExample(@Param("record") Plane record, @Param("example") PlaneExample example);

    int updateByPrimaryKeySelective(Plane record);

    int updateByPrimaryKey(Plane record);
}