package com.example.datong.dao;

import com.example.datong.model.ResidentialInfo;

public interface ResidentialInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResidentialInfo record);

    int insertSelective(ResidentialInfo record);

    ResidentialInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResidentialInfo record);

    int updateByPrimaryKey(ResidentialInfo record);
}