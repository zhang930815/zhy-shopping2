package com.iotek.test;

import com.iotek.po.Customer;
import com.iotek.po.Product;
import com.iotek.po.ProductDetail;
import com.iotek.service.CustomerService;
import com.iotek.service.ProductService;
import com.iotek.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/12/17.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");



    }
}
