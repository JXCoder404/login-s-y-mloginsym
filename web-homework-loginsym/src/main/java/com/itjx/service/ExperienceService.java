package com.itjx.service;

import com.itjx.mapper.ExperienceMapper;
import com.itjx.mapper.InfMapper;
import com.itjx.pojo.Experience;
import com.itjx.util.SqlSessionFactoryUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ExperienceService {

    public void update(Experience experience){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExperienceMapper mapper = sqlSession.getMapper(ExperienceMapper.class);
        mapper.update(experience);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<Experience> selectAllByUsername(String username){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExperienceMapper mapper = sqlSession.getMapper(ExperienceMapper.class);
        List<Experience> experiences = mapper.selectAllByUsername(username);
        sqlSession.close();
        return experiences;
    }

    public void insertOne(Experience experience){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExperienceMapper mapper = sqlSession.getMapper(ExperienceMapper.class);
        mapper.insertOne(experience);
        sqlSession.commit();
        sqlSession.close();
    }

    public Experience selectOneById(Integer id){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExperienceMapper mapper = sqlSession.getMapper(ExperienceMapper.class);
        Experience experience = mapper.selectOneById(id);
        sqlSession.close();
        return experience;

    }

    public void delete(Integer id){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ExperienceMapper mapper = sqlSession.getMapper(ExperienceMapper.class);
        mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
    }

    public void select(Integer id){

    }
}
