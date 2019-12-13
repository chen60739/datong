package com.example.datong.dao;

import com.example.datong.model.FamilyMemberToghter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FamilyMemberToghterMapper {
    /**
     * 查询家庭成员信息
     * @param id
     * @return
     */
    List<FamilyMemberToghter> selectById(Integer id);
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMemberToghter record);

    int insertSelective(FamilyMemberToghter record);

    FamilyMemberToghter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyMemberToghter record);

    int updateByPrimaryKey(FamilyMemberToghter record);
}