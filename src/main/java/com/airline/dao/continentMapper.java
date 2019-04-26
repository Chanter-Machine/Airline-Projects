package com.airline.dao;

import com.airline.bean.Continent;
import com.airline.bean.ContinentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface continentMapper {
    long countByExample(ContinentExample example);

    int deleteByExample(ContinentExample example);

    int deleteByPrimaryKey(Integer continentid);

    int insert(Continent record);

    int insertSelective(Continent record);

    List<Continent> selectByExample(ContinentExample example);

    Continent selectByPrimaryKey(Integer continentid);

    int updateByExampleSelective(@Param("record") Continent record, @Param("example") ContinentExample example);

    int updateByExample(@Param("record") Continent record, @Param("example") ContinentExample example);

    int updateByPrimaryKeySelective(Continent record);

    int updateByPrimaryKey(Continent record);
}