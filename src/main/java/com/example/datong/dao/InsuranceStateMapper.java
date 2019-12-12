package com.example.datong.dao;

import com.example.datong.model.InsuranceState;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsuranceStateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceState record);

    int insertSelective(InsuranceState record);

    InsuranceState selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InsuranceState record);

    int updateByPrimaryKey(InsuranceState record);
}