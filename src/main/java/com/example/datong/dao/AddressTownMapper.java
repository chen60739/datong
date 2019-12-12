package com.example.datong.dao;

import com.example.datong.model.AddressTown;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressTownMapper {
    int deleteByPrimaryKey(Integer townId);

    int insert(AddressTown record);

    int insertSelective(AddressTown record);

    AddressTown selectByPrimaryKey(Integer townId);

    int updateByPrimaryKeySelective(AddressTown record);

    int updateByPrimaryKey(AddressTown record);

    List<AddressTown> selectByCountyCode(String countyCode);
}