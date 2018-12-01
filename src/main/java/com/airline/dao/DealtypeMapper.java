package com.airline.dao;

import com.airline.bean.Dealtype;
import com.airline.bean.DealtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealtypeMapper {
    long countByExample(DealtypeExample example);

    int deleteByExample(DealtypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Dealtype record);

    int insertSelective(Dealtype record);

    List<Dealtype> selectByExample(DealtypeExample example);

    Dealtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Dealtype record, @Param("example") DealtypeExample example);

    int updateByExample(@Param("record") Dealtype record, @Param("example") DealtypeExample example);

    int updateByPrimaryKeySelective(Dealtype record);

    int updateByPrimaryKey(Dealtype record);
}