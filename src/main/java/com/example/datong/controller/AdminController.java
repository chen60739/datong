package com.example.datong.controller;

import com.example.datong.message.Result;
import com.example.datong.model.Admin;
import com.example.datong.service.AdminService;
import com.example.datong.util.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
    @Resource
    AdminService adminService;

    /**
     * 后台登录页面
     * @param adminPhone
     * @param adminPassword
     * @param request
     * @return
     */
    @RequestMapping("/back/login")
    @ResponseBody
    public Result login(String adminPhone, String adminPassword, HttpServletRequest request) {
        Result result = adminService.login(adminPhone, adminPassword, request);
        return result;
    }
    @RequestMapping("/back/main")
    public  String backMain(){
        return "back_main";
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
        record.setAdminPassword(MD5Utils.md5(record.getAdminPassword()));
        int register = adminService.register(record);
        System.out.println("注册成功");
        return "login";
    }

    @RequestMapping("/back/checkAdminPhone")
    @ResponseBody
    public boolean checkAdminPhone(@RequestParam("adminPhone") String adminPhone){
        boolean flag = adminService.checkPhone(adminPhone);
        return flag;
    }
}