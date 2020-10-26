package com.qf.hong.entity;

import java.io.Serializable;
import java.util.List;

public class Cate implements Serializable {
    /**
     * 主键
     */
    private Integer cateId;

    /**
     * 内容
     */
    private String name;

    /**
     * 状态值 0表示未删除 1表示删除
     */
    private Integer status;

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

