package com.itjx.service;

import com.itjx.mapper.UserMapper;
import com.itjx.pojo.User;
import com.itjx.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {

    public User login (String username, String password){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.select(username,password);
    }


    /**
     *
     * @param user
     * @return
     */
    public Boolean register(User user){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user1 = userMapper.selectByUsername(user.getUsername());


        if(user1==null) {
            //注册成功
            userMapper.add(user);
            sqlSession.commit();
            sqlSession.close();
        }

        sqlSession.close();

        return user1==null;

    }
}
