package com.example.datong.dao;

import com.example.datong.pojo.CompanyRegistrationInfo;

public interface CompanyRegistrationInfoMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(CompanyRegistrationInfo record);

    int insertSelective(CompanyRegistrationInfo record);

    CompanyRegistrationInfo selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(CompanyRegistrationInfo record);

    int updateByPrimaryKey(CompanyRegistrationInfo record);
}