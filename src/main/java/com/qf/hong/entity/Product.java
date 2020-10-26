package com.qf.hong.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    /**
     * 主键
     */
    private Integer productId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 价钱
     */
    private BigDecimal price;

    /**
     * 图片
     */
    private String img;

    /**
     * 外键
     */
    private Integer cateId;

    /**
     * 状态值 0表示未删除 1表示删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

