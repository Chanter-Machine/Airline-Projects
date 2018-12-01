package com.airline.dao;

import com.airline.bean.FlightRecord;
import com.airline.bean.FlightRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightRecordMapper {
    long countByExample(FlightRecordExample example);

    int deleteByExample(FlightRecordExample example);

    int deleteByPrimaryKey(Integer fligthrecord);

    int insert(FlightRecord record);

    int insertSelective(FlightRecord record);

    List<FlightRecord> selectByExample(FlightRecordExample example);

    FlightRecord selectByPrimaryKey(Integer fligthrecord);

    int updateByExampleSelective(@Param("record") FlightRecord record, @Param("example") FlightRecordExample example);

    int updateByExample(@Param("record") FlightRecord record, @Param("example") FlightRecordExample example);

    int updateByPrimaryKeySelective(FlightRecord record);

    int updateByPrimaryKey(FlightRecord record);
}