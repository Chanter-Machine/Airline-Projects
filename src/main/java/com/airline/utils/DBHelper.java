package com.airline.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBHelper {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    public SqlSession getSqlsession() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
