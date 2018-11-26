package com.airline.dao;

import com.airline.bean.Flight;
import com.airline.bean.FlightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightMapper {
    long countByExample(FlightExample example);

    int deleteByExample(FlightExample example);

    int deleteByPrimaryKey(Integer flightid);

    int insert(Flight record);

    int insertSelective(Flight record);

    List<Flight> selectByExample(FlightExample example);

    Flight selectByPrimaryKey(Integer flightid);

    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);

	void deleteById(Integer flightid);

	void insertFlight(Flight flight);
}