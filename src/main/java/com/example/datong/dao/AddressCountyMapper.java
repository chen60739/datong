package com.example.datong.dao;

import com.example.datong.model.AddressCounty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressCountyMapper {
    /**
     * 通过市code查询下面的 县/区
     * @param code
     * @return
     */
    List<AddressCounty>selectCountyBy(String code);

    /**
     * 查询所有county
     * @return
     */
    List<AddressCounty> selectCounty();

    int deleteByPrimaryKey(Integer countyId);

    int insert(AddressCounty record);

    int insertSelective(AddressCounty record);

    AddressCounty selectByPrimaryKey(Integer countyId);

    int updateByPrimaryKeySelective(AddressCounty record);

    int updateByPrimaryKey(AddressCounty record);

    List<AddressCounty> selectByCityCode(String cityCode);
}