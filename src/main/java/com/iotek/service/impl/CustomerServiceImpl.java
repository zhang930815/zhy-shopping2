package com.iotek.service.impl;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/17.
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;


    public boolean add(Customer customer) {
        if (customer == null) {
            return false;
        }
        boolean add = customerDao.add(customer);
        return add;
    }


    public boolean delete(Customer customer) {
        if (customer == null) {
            return false;
        }
        return customerDao.delete(customer);
    }


    public List<Customer> queryAll() {
        return customerDao.queryAll();
    }


    public Customer query(Customer customer) {
        if (customer == null) {

            return null;
        }
        Customer query = customerDao.query(customer);
        return query;
    }


    public boolean update(Customer customer) {
        return customerDao.update(customer);
    }


    public Customer queryAddressCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        return customerDao.queryAddressCustomer(customer);
    }


    public Customer queryCheckInfo(Customer customer) {
        if (customer == null) {
            return null;
        }
        return customerDao.queryCheckInfo(customer);
    }
}
