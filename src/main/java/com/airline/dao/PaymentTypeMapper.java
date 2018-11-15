package com.airline.dao;

import com.airline.bean.PaymentType;
import com.airline.bean.PaymentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentTypeMapper {
    long countByExample(PaymentTypeExample example);

    int deleteByExample(PaymentTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentType record);

    int insertSelective(PaymentType record);

    List<PaymentType> selectByExample(PaymentTypeExample example);

    PaymentType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentType record, @Param("example") PaymentTypeExample example);

    int updateByExample(@Param("record") PaymentType record, @Param("example") PaymentTypeExample example);

    int updateByPrimaryKeySelective(PaymentType record);

    int updateByPrimaryKey(PaymentType record);
}