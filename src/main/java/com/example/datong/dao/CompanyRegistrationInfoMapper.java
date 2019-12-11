package com.example.datong.dao;

import com.example.datong.model.CompanyRegistrationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyRegistrationInfoMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(CompanyRegistrationInfo record);

    int insertSelective(CompanyRegistrationInfo record);

    CompanyRegistrationInfo selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(CompanyRegistrationInfo record);

    int updateByPrimaryKey(CompanyRegistrationInfo record);

    CompanyRegistrationInfo findByPhone(String username);
}