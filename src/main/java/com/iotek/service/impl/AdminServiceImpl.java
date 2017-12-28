package com.iotek.service.impl;

import com.iotek.dao.AdminDao;
import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/27.
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    public boolean add(Admin admin) {
        return adminDao.add(admin);
    }

    public boolean delete(Admin admin) {
        return adminDao.delete(admin);
    }

    public List<Admin> queryAll() {
        return adminDao.queryAll();
    }

    public Admin query(Admin admin) {
        return adminDao.query(admin);
    }

    public boolean update(Admin admin) {
        return adminDao.update(admin);
    }
}
