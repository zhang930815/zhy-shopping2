package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class ProductShelf implements Serializable{
    private Long id;
    private Long productId;
    private Integer isUpShelf=0;
    private Timestamp operTime;
    private Timestamp shelfCreatTime;

    public ProductShelf() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getIsUpShelf() {
        return isUpShelf;
    }

    public void setIsUpShelf(Integer isUpShelf) {
        this.isUpShelf = isUpShelf;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    public Timestamp getShelfCreatTime() {
        return shelfCreatTime;
    }

    public void setShelfCreatTime(Timestamp shelfCreatTime) {
        this.shelfCreatTime = shelfCreatTime;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "id=" + id +
                ", productId=" + productId +
                ", isUpShelf=" + isUpShelf +
                ", operTime=" + operTime +
                ", shelfCreatTime=" + shelfCreatTime +
                '}';
    }
}
