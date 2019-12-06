package com.example.datong.dao;

import com.example.datong.model.FertilityInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FertilityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FertilityInfo record);

    int insertSelective(FertilityInfo record);

    FertilityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FertilityInfo record);

    int updateByPrimaryKey(FertilityInfo record);
}