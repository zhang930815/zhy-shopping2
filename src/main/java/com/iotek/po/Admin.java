package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/10.
 */
public class Admin implements Serializable{
    public static final String ADMIN_STATE_NORMAL="normal";
    public static final String ADMIN_STATE_NOT_NORMAL="not_normal";
    public static final int ADMIN_IS_LOGIND=1;
    public static final int ADMIN_IS_NOT_LOGIND=0;
    private Long id;
    private String adminName;
    private String adminPassword;
    private String adminState;
    private Timestamp adminLoginTime;
    private Integer adminIsLogind;

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public Admin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public Timestamp getAdminLoginTime() {
        return adminLoginTime;
    }

    public void setAdminLoginTime(Timestamp adminLoginTime) {
        this.adminLoginTime = adminLoginTime;
    }

    public Integer getAdminIsLogind() {
        return adminIsLogind;
    }

    public void setAdminIsLogind(Integer adminIsLogind) {
        this.adminIsLogind = adminIsLogind;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminState='" + adminState + '\'' +
                ", adminLoginTime=" + adminLoginTime +
                ", adminIsLogind=" + adminIsLogind +
                '}';
    }
}
