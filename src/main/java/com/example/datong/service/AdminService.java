package com.example.datong.service;

import com.example.datong.message.Result;
import com.example.datong.model.Admin;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    //登录
    Result login(String adminPhone, String adminPassword, HttpServletRequest request);

    boolean checkPhone(String adminPhone);



    //注册
    int register(Admin record);


}
