package com.example.datong.dao;

import com.example.datong.model.FloatingPopulation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FloatingPopulationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FloatingPopulation record);

    int insertSelective(FloatingPopulation record);

    FloatingPopulation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FloatingPopulation record);

    int updateByPrimaryKey(FloatingPopulation record);
    //根据省份查询人数
    int selectCountByProvince(String provinceCode);
}