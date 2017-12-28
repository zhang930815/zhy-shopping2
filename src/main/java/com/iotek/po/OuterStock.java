package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class OuterStock implements Serializable {
    private Long id;
    private Long productId;
    private Long outerStockNumber;
    private Timestamp outerStockTime;

    public OuterStock() {
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

    public Long getOuterStockNumber() {
        return outerStockNumber;
    }

    public void setOuterStockNumber(Long outerStockNumber) {
        this.outerStockNumber = outerStockNumber;
    }

    public Timestamp getOuterStockTime() {
        return outerStockTime;
    }

    public void setOuterStockTime(Timestamp outerStockTime) {
        this.outerStockTime = outerStockTime;
    }

    @Override
    public String toString() {
        return "OuterStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", outerStockNumber=" + outerStockNumber +
                ", outerStockTime=" + outerStockTime +
                '}';
    }
}
