package com.example.datong.service;

import com.example.datong.model.Admin;

public interface AdminService {
    //登录
    Admin login(String adminPhone, String adminPassword);
    Admin login1(String adminPhone);



    //注册
    int register(Admin record);


}
