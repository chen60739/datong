package com.example.datong.dao;

import com.example.datong.model.AddressTown;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressTownMapper {
    /**
     * 通过区查找下面的镇
     * @param code
     * @return
     */
    List<AddressTown>selectTownByCode(String code);
    /**
     * 查询所有镇
     * @return
     */
    List<AddressTown> selectTown();
    int deleteByPrimaryKey(Integer townId);

    int insert(AddressTown record);

    int insertSelective(AddressTown record);

    AddressTown selectByPrimaryKey(Integer townId);

    int updateByPrimaryKeySelective(AddressTown record);

    int updateByPrimaryKey(AddressTown record);

    List<AddressTown> selectByCountyCode(String countyCode);
}