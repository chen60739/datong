package com.example.datong.dao;

import com.example.datong.model.CheckReason;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckReasonMapper {
    CheckReason selectByAccountId(Integer id);

    int updateByAccountId(Integer id,String reason);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckReason record);

    int insertSelective(CheckReason checkReason);

    CheckReason selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckReason record);

    int updateByPrimaryKey(CheckReason record);
}