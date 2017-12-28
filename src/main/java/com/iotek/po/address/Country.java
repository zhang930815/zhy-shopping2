package com.iotek.po.address;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Country {
    private Integer id;
    private String countryName;
    private Integer cId;
    private List<Round> roundList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public List<Round> getRoundList() {
        return roundList;
    }

    public void setRoundList(List<Round> roundList) {
        this.roundList = roundList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", cId=" + cId +
                ", roundList=" + roundList +
                '}';
    }
}
