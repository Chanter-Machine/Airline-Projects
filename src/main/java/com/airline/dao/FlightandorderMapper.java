package com.airline.dao;

import com.airline.bean.Flightandorder;
import com.airline.bean.FlightandorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightandorderMapper {
    long countByExample(FlightandorderExample example);

    int deleteByExample(FlightandorderExample example);

    int deleteByPrimaryKey(Integer flightandorderid);

    int insert(Flightandorder record);

    int insertSelective(Flightandorder record);

    List<Flightandorder> selectByExample(FlightandorderExample example);

    Flightandorder selectByPrimaryKey(Integer flightandorderid);

    int updateByExampleSelective(@Param("record") Flightandorder record, @Param("example") FlightandorderExample example);

    int updateByExample(@Param("record") Flightandorder record, @Param("example") FlightandorderExample example);

    int updateByPrimaryKeySelective(Flightandorder record);

    int updateByPrimaryKey(Flightandorder record);
}