package com.example.datong.service.impl;

import com.example.datong.dao.AdminMapper;
import com.example.datong.dao.CompanyRegistrationInfoMapper;
import com.example.datong.message.Result;
import com.example.datong.message.ResultCode;
import com.example.datong.model.Admin;
import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.CompanyService;
import com.example.datong.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class CompanyImpl implements CompanyService {

    @Autowired
    private CompanyRegistrationInfoMapper companyRegistrationInfoMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void insert(CompanyRegistrationInfo company) {
        company.setGmtCreate(new Date());
        company.setGmtModified(new Date());
        company.setPassword(MD5Utils.md5(company.getPassword()));
        companyRegistrationInfoMapper.insert(company);
    }

    @Override
    public boolean checkUnitName(String unitName) {
        CompanyRegistrationInfo company = companyRegistrationInfoMapper.findByUnitName(unitName);
        if (company != null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean checkPhone(String phone) {
        CompanyRegistrationInfo company = companyRegistrationInfoMapper.findByPhone(phone);
        if (company != null) {
            return false;
        }else {
            Admin admin = adminMapper.selectByPhone(phone);
            if (admin != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Result login(String username, String password, HttpServletRequest request) {
        CompanyRegistrationInfo company = companyRegistrationInfoMapper.findByPhone(username);
        if (company!=null){
            String pwd = MD5Utils.md5(password);
            if (company.getPassword().equals(pwd)){
                request.getSession().setAttribute("user",company);
                return Result.success();
            }else {
                return Result.failure(ResultCode.PASSWORD_ERROR);
            }
        }else {
            return Result.failure(ResultCode.USER_NOT_EXIST);
        }
    }

}
