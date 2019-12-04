package com.example.datong.dao;

import com.example.datong.model.CompanyRegistrationInfo;

import java.util.List;

public interface CompanyRegistrationInfoMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(CompanyRegistrationInfo record);

    int insertSelective(CompanyRegistrationInfo record);

    CompanyRegistrationInfo selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(CompanyRegistrationInfo record);

    int updateByPrimaryKey(CompanyRegistrationInfo record);
    //注册信息审核查询
    List<CompanyRegistrationInfo> selectAll(CompanyRegistrationInfo companyRegistrationInfo);
}