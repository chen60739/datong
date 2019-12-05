package com.example.datong.dao;


import com.example.datong.model.EmploymentInfo;

public interface EmploymentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmploymentInfo record);

    int insertSelective(EmploymentInfo record);

    EmploymentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmploymentInfo record);

    int updateByPrimaryKey(EmploymentInfo record);
}