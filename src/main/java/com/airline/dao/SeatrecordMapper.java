package com.airline.dao;

import com.airline.bean.Seatrecord;
import com.airline.bean.SeatrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatrecordMapper {
    long countByExample(SeatrecordExample example);

    int deleteByExample(SeatrecordExample example);

    int deleteByPrimaryKey(Integer seatrecordid);

    int insert(Seatrecord record);

    int insertSelective(Seatrecord record);

    List<Seatrecord> selectByExample(SeatrecordExample example);

    Seatrecord selectByPrimaryKey(Integer seatrecordid);

    int updateByExampleSelective(@Param("record") Seatrecord record, @Param("example") SeatrecordExample example);

    int updateByExample(@Param("record") Seatrecord record, @Param("example") SeatrecordExample example);

    int updateByPrimaryKeySelective(Seatrecord record);

    int updateByPrimaryKey(Seatrecord record);
}