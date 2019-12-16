package com.example.datong.service.impl;

import com.example.datong.dao.AdminMapper;
import com.example.datong.dao.CompanyRegistrationInfoMapper;
import com.example.datong.message.Result;
import com.example.datong.message.ResultCode;
import com.example.datong.model.Admin;
import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.AdminService;
import com.example.datong.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Autowired
    private CompanyRegistrationInfoMapper companyRegistrationInfoMapper;


    @Override
    public Result login(String adminPhone, String adminPassword, HttpServletRequest request) {
        Admin admin = adminMapper.selectByPhone(adminPhone);
        if (admin != null) {
            String pwd = MD5Utils.md5(adminPassword);
            if(admin.getAdminPassword().equals(pwd)){
                request.getSession().setAttribute("admin",admin);
                return Result.success();
            }else {
                return Result.failure(ResultCode.PASSWORD_ERROR);
            }
        }else {
            return Result.failure(ResultCode.USER_NOT_EXIST);
        }
    }

    @Override
    public boolean checkPhone(String adminPhone) {
        Admin admin = adminMapper.selectByPhone(adminPhone);
        if (admin != null) {
            return false;
        }else {
            CompanyRegistrationInfo company = companyRegistrationInfoMapper.findByPhone(adminPhone);
            if (company != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int register(Admin record) {
        return adminMapper.insertSelective(record);
    }

}
