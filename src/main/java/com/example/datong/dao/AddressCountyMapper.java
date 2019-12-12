package com.example.datong.dao;

import com.example.datong.pojo.AddressCounty;

import java.util.List;

@Mapper
public interface AddressCountyMapper {
    int deleteByPrimaryKey(Integer countyId);

    int insert(AddressCounty record);

    int insertSelective(AddressCounty record);

    AddressCounty selectByPrimaryKey(Integer countyId);

    int updateByPrimaryKeySelective(AddressCounty record);

    int updateByPrimaryKey(AddressCounty record);

    List<AddressCounty> selectByCityCode(String cityCode);
}