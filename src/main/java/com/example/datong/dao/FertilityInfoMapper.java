package com.example.datong.dao;

import com.example.datong.pojo.FertilityInfo;

public interface FertilityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FertilityInfo record);

    int insertSelective(FertilityInfo record);

    FertilityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FertilityInfo record);

    int updateByPrimaryKey(FertilityInfo record);
}