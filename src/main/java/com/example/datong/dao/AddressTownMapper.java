package com.example.datong.dao;

import com.example.datong.pojo.AddressTown;

public interface AddressTownMapper {
    int deleteByPrimaryKey(Integer townId);

    int insert(AddressTown record);

    int insertSelective(AddressTown record);

    AddressTown selectByPrimaryKey(Integer townId);

    int updateByPrimaryKeySelective(AddressTown record);

    int updateByPrimaryKey(AddressTown record);
}