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

    /**
     * 后台登录页面
     * @param adminPhone
     * @param adminPassword
     * @param session
     * @return
     */
    @RequestMapping("back_login")
    public String login(String adminPhone, String adminPassword, HttpSession session) {
        Admin login = adminService.login(adminPhone, adminPassword);
        if (login != null) {
            session.setAttribute("admin",login);
            return "back.html";
        }
        return "index.html";
    }
    @RequestMapping("back_index")
    public  String back_index(){
        return "back_index";
    }


    /**
     * 注册
     * @param record
     * @return
     */
    @RequestMapping("back_register")
    public String register(Admin record) {
        Admin admin=new Admin();
        admin.setAdminPhone(record.getAdminPhone());
        admin.setAdminPassword(record.getAdminPassword());
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