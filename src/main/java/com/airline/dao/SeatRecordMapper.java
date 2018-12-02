package com.airline.dao;

import com.airline.bean.SeatRecord;
import com.airline.bean.SeatRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeatRecordMapper {
    long countByExample(SeatRecordExample example);

    int deleteByExample(SeatRecordExample example);

    int deleteByPrimaryKey(Integer seatrecordid);

    int insert(SeatRecord record);

    int insertSelective(SeatRecord record);

    List<SeatRecord> selectByExample(SeatRecordExample example);

    SeatRecord selectByPrimaryKey(Integer seatrecordid);
    
    List<SeatRecord> selectByExampleWithPlane(SeatRecordExample example);

    int updateByExampleSelective(@Param("record") SeatRecord record, @Param("example") SeatRecordExample example);

    int updateByExample(@Param("record") SeatRecord record, @Param("example") SeatRecordExample example);

    int updateByPrimaryKeySelective(SeatRecord record);

    int updateByPrimaryKey(SeatRecord record);
}