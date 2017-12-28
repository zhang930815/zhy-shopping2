package com.iotek.controller;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/12/25.
 */
@Controller
@RequestMapping("customer1")
public class HelloController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    /*public String hello1(HashMap<String,Object> hashMap){
        hashMap.put("name","xiaozhang");
        hashMap.put("age",18);
        //返回的结果是一个数据或者是试图的名字
        return "welcome";
    }*/

    /*public String hello(ModelMap modelMap) {
        Customer customer = new Customer();
        customer.setCustomerName("xiaozhang");
        customer.setCustomerMoney(new BigDecimal(5444));
        modelMap.addAttribute("customer", customer);
        return "welcome";
    }*/

    public ModelAndView hello(ModelAndView modelAndView) {

        Customer customer = new Customer();

        customer.setCustomerName("xiaozhang");

        customer.setCustomerMoney(new BigDecimal(15444));
        modelAndView.addObject("customer", customer);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String getCustomer(Model model, HttpSession httpSession) {
        Customer customer = new Customer();
        customer.setCustomerName("xiaozhang");
        customer.setCustomerPassword("123456");
        customer = customerService .query(customer);
        if (customer == null) {
            model.addAttribute("info", "没有找到该用户");
            return "error";
        }
        httpSession.setAttribute("customer", customer);
        return "success";
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String getInfo() {

        return "success";
    }

    @RequestMapping(value = "table/{name}/{age}", method = RequestMethod.GET)
    public String getTable(@PathVariable String name, @PathVariable int age) {
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String loginCustomer(@ModelAttribute Customer customer, HttpSession httpSession) {
        customer = customerService.query(customer);
        if (customer == null) {
            return "error";
        }
        httpSession.setAttribute("customer", customer);
        return "success";

    }

}
