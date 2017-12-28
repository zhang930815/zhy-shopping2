package com.iotek.po.address;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class City {
    private Integer id;
    private String cityName;
    private Integer pId;
    private List<Country> countryList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", pId=" + pId +
                ", countryList=" + countryList +
                '}';
    }
}
