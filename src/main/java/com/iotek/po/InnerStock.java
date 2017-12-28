package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class InnerStock implements Serializable{
    private Long id;
    private Long productId;
    private Long innerStockNumber;
    private Timestamp innerStockTime;

    public InnerStock() {
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

    public Long getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Long innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Timestamp getInnerStockTime() {
        return innerStockTime;
    }

    public void setInnerStockTime(Timestamp innerStockTime) {
        this.innerStockTime = innerStockTime;
    }

    @Override
    public String toString() {
        return "InnerStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", innerStockNumber=" + innerStockNumber +
                ", innerStockTime=" + innerStockTime +
                '}';
    }
}
