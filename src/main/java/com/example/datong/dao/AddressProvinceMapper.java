package com.example.datong.dao;

import com.example.datong.model.AddressProvince;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressProvinceMapper {
    /**
     * 查询配偶地址信息
     * @param countyCode
     * @return
     */
    AddressProvince selectSpouseAddress(String countyCode);
    /**
     * 根据镇编码查询现居住地址信息
     * @param townCode
     * @return  地址对象
     */
    AddressProvince selectCodeName(String townCode);

    /**
     * 查询所有的省份
     * @return
     */
    List<AddressProvince> selectAllProvince();
    int deleteByPrimaryKey(Integer provinceId);

    int insert(AddressProvince record);

    int insertSelective(AddressProvince record);

    AddressProvince selectByPrimaryKey(Integer provinceId);

    int updateByPrimaryKeySelective(AddressProvince record);

    int updateByPrimaryKey(AddressProvince record);

    List<AddressProvince> selectAll();

}