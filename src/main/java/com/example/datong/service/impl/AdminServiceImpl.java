package com.example.datong.service.impl;

import com.example.datong.dao.AdminMapper;
import com.example.datong.model.Admin;
import com.example.datong.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;


    @Override
    public Admin login(String adminPhone, String adminPassword) {
        Admin admin = adminMapper.selectOne(adminPhone, adminPassword);
        if (admin!=null && admin.getAdminPassword().equals(adminPassword)){
            return admin;
        }
        return null;

    }

    @Override
    public Admin login1(String adminPhone) {
        return adminMapper.selectOne1(adminPhone);
    }

    @Override
    public int register(Admin record) {
        return adminMapper.insertSelective(record);
    }

}
