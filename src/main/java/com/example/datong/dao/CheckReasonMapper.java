package com.example.datong.dao;

import com.example.datong.model.CheckReason;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckReasonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckReason record);

    int insertSelective(CheckReason record);

    CheckReason selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckReason record);

    int updateByPrimaryKey(CheckReason record);
    //添加审核原因
    int insertrecord(CheckReason record);
    //根据id查询是否有审核原因
    CheckReason selectOne(Integer id);
}