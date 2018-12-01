package com.airline.dao;

import com.airline.bean.UserActivation;
import com.airline.bean.UserActivationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserActivationMapper {
    long countByExample(UserActivationExample example);

    int deleteByExample(UserActivationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserActivation record);

    int insertSelective(UserActivation record);

    List<UserActivation> selectByExample(UserActivationExample example);

    UserActivation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserActivation record, @Param("example") UserActivationExample example);

    int updateByExample(@Param("record") UserActivation record, @Param("example") UserActivationExample example);

    int updateByPrimaryKeySelective(UserActivation record);

    int updateByPrimaryKey(UserActivation record);
}