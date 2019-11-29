package com.example.datong.dao;

import com.example.datong.pojo.InsuranceState;

public interface InsuranceStateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceState record);

    int insertSelective(InsuranceState record);

    InsuranceState selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InsuranceState record);

    int updateByPrimaryKey(InsuranceState record);
}