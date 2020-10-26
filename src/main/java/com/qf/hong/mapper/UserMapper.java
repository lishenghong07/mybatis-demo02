package com.qf.hong.mapper;

import com.qf.hong.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //保存数据
    int insert(@Param("users")Users users);
    //查询数据
    List<Users> selectList();
}
