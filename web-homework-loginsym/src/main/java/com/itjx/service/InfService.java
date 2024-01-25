package com.itjx.service;

import com.itjx.mapper.InfMapper;
import com.itjx.pojo.Inf;
import com.itjx.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class InfService {

    public Inf selectAll(String username){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        InfMapper mapper = sqlSession.getMapper(InfMapper.class);
        Inf inf = mapper.select(username);
        sqlSession.close();
        return inf;

    }

    public boolean updateAll(Inf inf){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        InfMapper mapper = sqlSession.getMapper(InfMapper.class);
        boolean flag = mapper.update(inf);
        sqlSession.commit();
        sqlSession.close();
        return flag;
    }

    public void updateImg(String username,String url_img){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        InfMapper mapper = sqlSession.getMapper(InfMapper.class);
        mapper.updateImg(username,url_img);
        sqlSession.commit();
        sqlSession.close();

    }

    public void createNewUser(String username){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        InfMapper mapper = sqlSession.getMapper(InfMapper.class);
        mapper.createByUsername(username);
        sqlSession.commit();
        sqlSession.close();

    }
}
