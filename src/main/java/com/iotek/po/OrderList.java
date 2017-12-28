package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Administrator on 2017/11/10.
 */
public class OrderList implements Serializable{
    /*public static final ORDERLIST_NOMAL="nomal";*/
    
    private Long id;
    private Long customerId;
    private BigDecimal totalMoney;
    private Timestamp orderCreateTime;
    private Integer orderState;
    private Integer isPay;
    private Customer customer;
    private List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public OrderList() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", orderCreateTime=" + orderCreateTime +
                ", orderState=" + orderState +
                ", isPay=" + isPay +
                '}';
    }
}
