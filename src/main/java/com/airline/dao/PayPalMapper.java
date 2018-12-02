package com.airline.dao;

import com.airline.bean.PayPal;
import com.airline.bean.PayPalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayPalMapper {
    long countByExample(PayPalExample example);

    int deleteByExample(PayPalExample example);

    int deleteByPrimaryKey(String paypalid);

    int insert(PayPal record);

    int insertSelective(PayPal record);

    List<PayPal> selectByExample(PayPalExample example);

    PayPal selectByPrimaryKey(String paypalid);

    int updateByExampleSelective(@Param("record") PayPal record, @Param("example") PayPalExample example);

    int updateByExample(@Param("record") PayPal record, @Param("example") PayPalExample example);

    int updateByPrimaryKeySelective(PayPal record);

    int updateByPrimaryKey(PayPal record);
}