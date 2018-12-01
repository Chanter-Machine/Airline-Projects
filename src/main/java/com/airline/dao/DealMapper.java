package com.airline.dao;

import com.airline.bean.Deal;
import com.airline.bean.DealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealMapper {
    long countByExample(DealExample example);

    int deleteByExample(DealExample example);

    int deleteByPrimaryKey(Integer dealid);

    int insert(Deal record);

    int insertSelective(Deal record);

    List<Deal> selectByExample(DealExample example);

    Deal selectByPrimaryKey(Integer dealid);

    int updateByExampleSelective(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByExample(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByPrimaryKeySelective(Deal record);

    int updateByPrimaryKey(Deal record);
}