package com.example.datong.dao;

import com.example.datong.model.LessorInfo;

public interface LessorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LessorInfo record);

    int insertSelective(LessorInfo record);

    LessorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LessorInfo record);

    int updateByPrimaryKey(LessorInfo record);
}