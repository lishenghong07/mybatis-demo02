package com.qf.hong;

import com.qf.hong.entity.Users;
import com.qf.hong.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    public static void main(String[] args) {
        //创建工厂
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        //选择提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //创建对象
        Users users = new Users();
        //给对象进行赋值
        users.setUsername("lihua");
        users.setPassword("123");
        //给mapper对象进行赋值
        int insert = mapper.insert(users);
        System.out.println(insert);
    }
}
