package com.airline.dao;

import com.airline.bean.PaymentType;
import com.airline.bean.PaymentTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentTypeMapper {
    long countByExample(PaymentTypeExample example);

    int deleteByExample(PaymentTypeExample example);

    int deleteByPrimaryKey(Integer paymenttypeid);

    int insert(PaymentType record);

    int insertSelective(PaymentType record);

    List<PaymentType> selectByExample(PaymentTypeExample example);

    PaymentType selectByPrimaryKey(Integer paymenttypeid);

    int updateByExampleSelective(@Param("record") PaymentType record, @Param("example") PaymentTypeExample example);

    int updateByExample(@Param("record") PaymentType record, @Param("example") PaymentTypeExample example);

    int updateByPrimaryKeySelective(PaymentType record);

    int updateByPrimaryKey(PaymentType record);
}