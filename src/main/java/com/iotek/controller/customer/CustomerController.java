package com.iotek.controller.customer;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/26.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) {
        String customerName = request.getParameter("customerName");
        String customerPassword = request.getParameter("customerPassword");
        String remember = request.getParameter("remember");
        if (remember != null) {
            Cookie cookieName = new Cookie("customerName", customerName);
            Cookie cookiePassword = new Cookie("customerPassword", customerPassword);
            cookieName.setMaxAge(1 * 60 * 60 * 24 * 7);
            cookieName.setPath("/");
            cookiePassword.setMaxAge(1 * 60 * 60 * 24);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        customer = customerService.query(customer);
        if (customer == null) {
            httpSession.setAttribute("info", "登陆失败");
            return "redirect:/customer/index";
        }
        httpSession.setAttribute("info", "登录成功" + "欢迎" + customerName);
        httpSession.setAttribute("customer", customer);
        return "customerIndex";

    }

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    public String register(@ModelAttribute Customer customer, Model model) {
        if (customer == null) {
            return "error/500";
        }
        boolean add = customerService.add(customer);
        if (add == false) {
            //判断用户是否重名 前端验证
            model.addAttribute("info", "注册失败");
        }
        model.addAttribute("info", "注册成功");
        return "redirect:/customer/index";

    }

    @RequestMapping(value = "register.view", method = RequestMethod.GET)
    public String register() {
        return "customer/customerRegister";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/customerCheckEmail/{customerEmail}", method = RequestMethod.GET)
    public void checkEmail(@PathVariable (value = "customerEmail") String customerEmail, HttpServletResponse response) {

        System.out.println(customerEmail);
        Customer customer = new Customer();
        customer.setCustomerEmail(customerEmail);
        customer = customerService.queryCheckInfo(customer);
        if (customer == null) {
            try {
                response.getWriter().print("error");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.getWriter().print("success");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
