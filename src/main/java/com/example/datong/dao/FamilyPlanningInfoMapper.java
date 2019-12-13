package com.example.datong.dao;

import com.example.datong.model.FamilyPlanningInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FamilyPlanningInfoMapper {
    /**
     * 通过个人id查询计划生育信息
     * @param id 个人id
     * @return  计生信息对象
     */
    FamilyPlanningInfo selectPlanningInfo(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyPlanningInfo record);

    int insertSelective(FamilyPlanningInfo record);

    FamilyPlanningInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyPlanningInfo record);

    int updateByPrimaryKey(FamilyPlanningInfo record);
}