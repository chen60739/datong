package com.example.datong.dao;


import com.example.datong.model.EmploymentInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmploymentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmploymentInfo record);

    int insertSelective(EmploymentInfo record);

    EmploymentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmploymentInfo record);

    int updateByPrimaryKey(EmploymentInfo record);
}