package com.example.datong.controller;

import com.example.datong.model.Admin;
import com.example.datong.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Resource
    AdminService adminService;

    /**
     * 后台登录页面
     * @param adminPhone
     * @param adminPassword
     * @param session
     * @return
     */
    @RequestMapping("/back/login")
    public String login(String adminPhone, String adminPassword, HttpSession session) {
        Admin login = adminService.login(adminPhone, adminPassword);
        if (login != null) {
            session.setAttribute("admin",login);
            return "back_main";
        }
        return "back_login";
    }
    @RequestMapping("/back/loginPage")
    public  String back_login(){
        return "back_login";
    }

    @RequestMapping("/back/registerPage")
    public  String back_register(){
        return "back_register";
    }


    /**
     * 注册
     * @param record
     * @return
     */
    @RequestMapping("/back/register")
    public String register(Admin record) {
        int register = adminService.register(record);
        System.out.println("注册成功");
        return "login";
    }

    @RequestMapping("/back/checkAdminPhone")
    @ResponseBody
    public boolean checkAdminPhone(@RequestParam("adminPhone") String adminPhone){
        Admin admin = adminService.login1(adminPhone);
        if (admin != null) {
            return false;
        }
        return true;
    }
}