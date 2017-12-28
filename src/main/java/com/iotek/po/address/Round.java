package com.iotek.po.address;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Round {
    private Integer id;
    private String roundName;
    private Integer ctId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    @Override
    public String toString() {
        return "Round{" +
                "id=" + id +
                ", roundName='" + roundName + '\'' +
                ", ctId=" + ctId +
                '}';
    }
}
