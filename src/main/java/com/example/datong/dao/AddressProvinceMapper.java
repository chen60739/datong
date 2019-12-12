package com.example.datong.dao;

import com.example.datong.model.AddressProvince;
import com.example.datong.model.AddressProvince;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressProvinceMapper {
    int deleteByPrimaryKey(Integer provinceId);

    int insert(AddressProvince record);

    int insertSelective(AddressProvince record);

    AddressProvince selectByPrimaryKey(Integer provinceId);

    int updateByPrimaryKeySelective(AddressProvince record);

    int updateByPrimaryKey(AddressProvince record);

    List<AddressProvince> selectAll();

}