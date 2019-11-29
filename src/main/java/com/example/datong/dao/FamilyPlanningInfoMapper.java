package com.example.datong.dao;

import com.example.datong.pojo.FamilyPlanningInfo;

public interface FamilyPlanningInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyPlanningInfo record);

    int insertSelective(FamilyPlanningInfo record);

    FamilyPlanningInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyPlanningInfo record);

    int updateByPrimaryKey(FamilyPlanningInfo record);
}