package com.example.datong.service;

import com.example.datong.message.Result;
import com.example.datong.model.Admin;
import com.example.datong.model.Role;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    //登录
    Result login(String adminPhone, String adminPassword, HttpServletRequest request);

    boolean checkPhone(String adminPhone);



    //注册
    int register(Admin record);

    List<Role> findMenuByPower(Integer power);

    Map<String,Object> findAdminByPower(Integer power);


}
