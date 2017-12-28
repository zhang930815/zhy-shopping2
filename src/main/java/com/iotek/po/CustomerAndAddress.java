package com.iotek.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/13.
 */
public class CustomerAndAddress implements Serializable {
    private Long aId;
    private String province;
    private String city;
    private String country;
    private String road;
    private Long customerId;
    private Long cId;

    public CustomerAndAddress() {
    }

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "CustomerAndAddress{" +
                "aId=" + aId +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", road='" + road + '\'' +
                ", customerId=" + customerId +
                ", cId=" + cId +
                '}';
    }
}
