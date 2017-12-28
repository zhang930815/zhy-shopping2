package com.iotek.controller.admin;

import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String loginView(){
        return "admin/adminLogin";

    }
    @RequestMapping(value = "login.view",method = RequestMethod.GET)
    public String login(){

        return "admin/index";
    }


    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(@ModelAttribute Admin admin , HttpSession httpSession){
        if (admin == null) {
            return "redirect: admin/adminLogin";
        }
        admin = adminService.query(admin);
        if (admin == null) {
            httpSession.setAttribute("info","登陆失败，账号或密码错误");
            return "redirect: admin/adminLogin";
        }
        httpSession.setAttribute("admin",admin);
        return "admin/index";
    }



 }
