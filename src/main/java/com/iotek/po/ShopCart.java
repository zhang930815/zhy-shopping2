package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class ShopCart implements Serializable{
    private Long id;
    private Long customerId;
    private Long productId;
    private Long productNumber;
    private Timestamp shopCreateTime;
    private Integer isShopCartTimeout;

    public ShopCart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public Timestamp getShopCreateTime() {
        return shopCreateTime;
    }

    public void setShopCreateTime(Timestamp shopCreateTime) {
        this.shopCreateTime = shopCreateTime;
    }

    public Integer getIsShopCartTimeout() {
        return isShopCartTimeout;
    }

    public void setIsShopCartTimeout(Integer isShopCartTimeout) {
        this.isShopCartTimeout = isShopCartTimeout;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", shopCreateTime=" + shopCreateTime +
                ", isShopCartTimeout=" + isShopCartTimeout +
                '}';
    }
}
