package com.iotek.po.address;

import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Province {
    private String name;
    private Integer id;
    private List<City> cityList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cityList=" + cityList +
                '}';
    }
}
