package com.airline.dao;

import com.airline.bean.Dealdate;
import com.airline.bean.DealdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealdateMapper {
    long countByExample(DealdateExample example);

    int deleteByExample(DealdateExample example);

    int deleteByPrimaryKey(Integer rangeid);

    int insert(Dealdate record);

    int insertSelective(Dealdate record);

    List<Dealdate> selectByExample(DealdateExample example);

    Dealdate selectByPrimaryKey(Integer rangeid);

    int updateByExampleSelective(@Param("record") Dealdate record, @Param("example") DealdateExample example);

    int updateByExample(@Param("record") Dealdate record, @Param("example") DealdateExample example);

    int updateByPrimaryKeySelective(Dealdate record);

    int updateByPrimaryKey(Dealdate record);
}