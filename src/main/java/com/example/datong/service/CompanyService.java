package com.example.datong.service;

import com.example.datong.message.Result;
import com.example.datong.model.CompanyRegistrationInfo;

import javax.servlet.http.HttpServletRequest;

public interface CompanyService {
    void insert(CompanyRegistrationInfo company);

    Result login(String username, String password, HttpServletRequest request);

    boolean checkPhone(String phone);

    boolean checkUnitName(String unitName);
}
