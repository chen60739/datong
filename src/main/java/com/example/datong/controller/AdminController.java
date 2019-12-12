package com.example.datong.controller;

import com.example.datong.model.Admin;
import com.example.datong.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Resource
    AdminService adminService;

    //登录
    @RequestMapping("back_login")
    public String login(String adminPhone, String adminPassword, HttpSession session) {
        Admin login = adminService.login(adminPhone, adminPassword);
        if (login != null) {
            session.setAttribute("admin",login);
            return "back.html";
        }
        return "back_login";
    }
    @RequestMapping("back_loginPage")
    public  String back_login(){
        return "back_login";
    }
    @RequestMapping("back_registerPage")
    public  String back_register(){
        return "back_register";
    }


    //注册
    @RequestMapping("back_register")
    public String register(Admin record) {
        Admin login = adminService.login1(record.getAdminPhone());
        if (login !=null  && login.getAdminPhone().equals(record.getAdminPhone())){
            System.out.println("注册失败");
            return "back_register.html";
        }else {
            int register = adminService.register(record);
            System.out.println("注册成功");
            return "back_index.html";
        }
    }
}