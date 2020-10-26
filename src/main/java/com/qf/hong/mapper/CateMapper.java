package com.qf.hong.mapper;

import com.qf.hong.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CateMapper {
    //查询数据
    List<Cate> selectList();
    //保存数据
    int insert(@Param("cate") Cate cate);
}
