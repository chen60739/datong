package com.example.datong.dao;

import com.example.datong.pojo.CheckReason;

public interface CheckReasonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckReason record);

    int insertSelective(CheckReason record);

    CheckReason selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckReason record);

    int updateByPrimaryKey(CheckReason record);
}