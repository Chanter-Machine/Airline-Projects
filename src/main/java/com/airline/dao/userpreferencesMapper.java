package com.airline.dao;

import com.airline.bean.userpreferences;
import com.airline.bean.userpreferencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userpreferencesMapper {
    long countByExample(userpreferencesExample example);

    int deleteByExample(userpreferencesExample example);

    int deleteByPrimaryKey(Integer preferenceid);

    int insert(userpreferences record);

    int insertSelective(userpreferences record);

    List<userpreferences> selectByExample(userpreferencesExample example);

    userpreferences selectByPrimaryKey(Integer preferenceid);

    int updateByExampleSelective(@Param("record") userpreferences record, @Param("example") userpreferencesExample example);

    int updateByExample(@Param("record") userpreferences record, @Param("example") userpreferencesExample example);

    int updateByPrimaryKeySelective(userpreferences record);

    int updateByPrimaryKey(userpreferences record);
}