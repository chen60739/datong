package com.example.datong.dao;

import com.example.datong.model.AddressCounty;

public interface AddressCountyMapper {
    int deleteByPrimaryKey(Integer countyId);

    int insert(AddressCounty record);

    int insertSelective(AddressCounty record);

    AddressCounty selectByPrimaryKey(Integer countyId);

    int updateByPrimaryKeySelective(AddressCounty record);

    int updateByPrimaryKey(AddressCounty record);
}