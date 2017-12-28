package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class ProductStock implements Serializable {
    private Long id;
    private Long productId;
    private Long stockNumber;
    private Timestamp stockModifiedTime;
    private Timestamp stockCreateTime;
    private Product product;

    public ProductStock() {
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

    public Long getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Long stockNumber) {
        this.stockNumber = stockNumber;
    }


    public Timestamp getStockCreateTime() {
        return stockCreateTime;
    }

    public void setStockCreateTime(Timestamp stockCreateTime) {
        this.stockCreateTime = stockCreateTime;
    }

    public Timestamp getStockModifiedTime() {
        return stockModifiedTime;
    }

    public void setStockModifiedTime(Timestamp stockModifiedTime) {
        this.stockModifiedTime = stockModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", stockNumber=" + stockNumber +
                ", stockModifiedTime=" + stockModifiedTime +
                ", stockCreateTime=" + stockCreateTime +
                '}';
    }
}
