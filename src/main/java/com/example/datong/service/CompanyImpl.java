package com.example.datong.service;

import com.example.datong.dao.CompanyRegistrationInfoMapper;
import com.example.datong.message.Result;
import com.example.datong.message.ResultCode;
import com.example.datong.model.CompanyRegistrationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class CompanyImpl implements CompanyService {

    @Autowired
    private CompanyRegistrationInfoMapper companyRegistrationInfoMapper;

    @Override
    public void insert(CompanyRegistrationInfo company) {
        company.setGmtCreate(new Date());
        company.setGmtModified(new Date());
        companyRegistrationInfoMapper.insert(company);
    }

    @Override
    public boolean checkPhone(String phone) {
        CompanyRegistrationInfo compangy = companyRegistrationInfoMapper.findByPhone(phone);
        if (compangy != null) {
            return false;
        }
        return true;
    }

    @Override
    public Result login(String username, String password, HttpServletRequest request) {
        CompanyRegistrationInfo company = companyRegistrationInfoMapper.findByPhone(username);
        if (company!=null){
            if (company.getPassword().equals(password)){
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
