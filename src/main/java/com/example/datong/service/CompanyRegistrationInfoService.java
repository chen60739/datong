package com.example.datong.service;

import com.example.datong.model.CompanyRegistrationInfo;

import java.util.Map;

public interface CompanyRegistrationInfoService {
    //注册信息审核查询
    Map<String,Object> findAll(CompanyRegistrationInfo companyRegistrationInfo);
}
