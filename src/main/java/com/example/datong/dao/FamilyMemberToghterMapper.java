package com.example.datong.dao;

import com.example.datong.model.FamilyMemberToghter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FamilyMemberToghterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMemberToghter record);

    int insertSelective(FamilyMemberToghter record);

    FamilyMemberToghter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyMemberToghter record);

    int updateByPrimaryKey(FamilyMemberToghter record);
}