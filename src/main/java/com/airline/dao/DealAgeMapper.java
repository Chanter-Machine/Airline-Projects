package com.airline.dao;

import com.airline.bean.DealAge;
import com.airline.bean.DealAgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealAgeMapper {
    long countByExample(DealAgeExample example);

    int deleteByExample(DealAgeExample example);

    int deleteByPrimaryKey(Integer rangeid);

    int insert(DealAge record);

    int insertSelective(DealAge record);

    List<DealAge> selectByExample(DealAgeExample example);

    DealAge selectByPrimaryKey(Integer rangeid);

    int updateByExampleSelective(@Param("record") DealAge record, @Param("example") DealAgeExample example);

    int updateByExample(@Param("record") DealAge record, @Param("example") DealAgeExample example);

    int updateByPrimaryKeySelective(DealAge record);

    int updateByPrimaryKey(DealAge record);
}