package com.iotek.service;

import com.iotek.po.Address;
import com.iotek.po.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/12/17.
 */

public interface CustomerService extends BaseService<Customer> {
   Customer queryAddressCustomer(Customer customer);
   Customer queryCheckInfo(Customer customer);
}
