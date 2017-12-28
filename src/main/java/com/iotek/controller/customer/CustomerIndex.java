package com.iotek.controller.customer;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/12/26.
 */
@Controller
public class CustomerIndex {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpSession session) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "redirect:/customer/index";
        }
        String customerName = null;
        String customerPassword = null;
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());

            if (cookie != null) {
                if (cookie.getName() != null && "customerName".equals(cookie.getName())) {
                    customerName = cookie.getValue();
                }
                if (cookie != null) {
                    if (cookie.getName() != null && "customerPassword".equals(cookie.getName())) {
                        customerPassword = cookie.getValue();
                    }

                }
            }

        }
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        customer = customerService.query(customer);
        if (customer == null) {
            return "redirect: /customer/index";
        }
        session.setAttribute("customer",customer);
        return "customerIndex";
    }
}
