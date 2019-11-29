package com.example.datong.dao;

import com.example.datong.pojo.FloatingPopulation;

public interface FloatingPopulationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FloatingPopulation record);

    int insertSelective(FloatingPopulation record);

    FloatingPopulation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FloatingPopulation record);

    int updateByPrimaryKey(FloatingPopulation record);
}