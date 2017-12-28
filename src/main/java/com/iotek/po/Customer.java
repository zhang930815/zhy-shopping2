package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Customer implements Serializable{
    //用户账号不正常
    public static final Integer  NOT_NORMAL=0;
    //用户账号正常
    public static final Integer  NORMAL=1;
    //用户未登陆
    public static final Integer NOT_LOGIND=0;
    //用户已登陆
    public static final Integer LOGIND=1;

    private Long id;
    private String customerName;
    private String customerPassword;
    private String customerPhone;
    private String customerEmail;
    private BigDecimal customerMoney;
    /*private Timestamp customerLoginTime;//最近登陆时间*/
    private Timestamp customerCreatTime;//用户创建时间
    private Integer isNormal;//用户是否正常
    /*private Integer isLogind;//用户是否登陆*/
    private List<Address> addressList;
    private List<OrderList> orderList;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public BigDecimal getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(BigDecimal customerMoney) {
        this.customerMoney = customerMoney;
    }

    /*public Timestamp getCustomerLoginTime() {
        return customerLoginTime;
    }*/

/*    public void setCustomerLoginTime(Timestamp customerLoginTime) {
        this.customerLoginTime = customerLoginTime;
    }*/

    public Timestamp getCustomerCreateTime() {
        return customerCreatTime;
    }

    public void setCustomerCreateTime(Timestamp customerCreateTime) {
        this.customerCreatTime = customerCreateTime;
    }

    public Integer getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Integer isNormal) {
        this.isNormal = isNormal;
    }

   /* public Integer getIsLogind() {
        return isLogind;
    }*/

   /* public void setIsLogind(Integer isLogind) {
        this.isLogind = isLogind;
    }*/

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Timestamp getCustomerCreatTime() {
        return customerCreatTime;
    }

    public void setCustomerCreatTime(Timestamp customerCreatTime) {
        this.customerCreatTime = customerCreatTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMoney=" + customerMoney +
                ", customerCreatTime=" + customerCreatTime +
                ", isNormal=" + isNormal +
                ", addressList=" + addressList +
                '}';
    }
}
