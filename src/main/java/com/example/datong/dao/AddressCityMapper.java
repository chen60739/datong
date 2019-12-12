package com.example.datong.dao;


import com.example.datong.model.AddressCity;

public interface AddressCityMapper {
    int deleteByPrimaryKey(Integer cityId);

    int insert(AddressCity record);

    int insertSelective(AddressCity record);

    AddressCity selectByPrimaryKey(Integer cityId);

    int updateByPrimaryKeySelective(AddressCity record);

    int updateByPrimaryKey(AddressCity record);
}