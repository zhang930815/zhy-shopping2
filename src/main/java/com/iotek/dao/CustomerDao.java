package com.iotek.dao;


import com.iotek.po.Customer;
import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2017/12/17.
 */
@Component
public interface CustomerDao extends BaseDao<Customer> {
    Customer queryAddressCustomer(Customer customer);
    Customer queryCheckInfo(Customer customer);


}
