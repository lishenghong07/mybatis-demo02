package com.qf.hong.mapper;

import com.qf.hong.entity.Cate;
import com.qf.hong.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    //查询数据
    List<Product> selectListByCateId(@Param("cateId")int cateId);
    //保存数据
    int insert(@Param("product") Product product);
}
