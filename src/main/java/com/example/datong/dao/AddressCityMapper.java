package com.example.datong.dao;

import com.example.datong.model.AddressCity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressCityMapper {
    /**
     * 通过省code查询下面的city
     * @param code
     * @return
     */
    List<AddressCity>selectCityBy(String code);
    /**
     * 通过cityCode找到对应的省
     * @param code
     * @return
     */
    String selectProvinceByCityCode(String code);

    /**
     * 查询所有city
     * @return
     */
    List<AddressCity> selectCity();
    int deleteByPrimaryKey(Integer cityId);

    int insert(AddressCity record);

    int insertSelective(AddressCity record);

    AddressCity selectByPrimaryKey(Integer cityId);

    int updateByPrimaryKeySelective(AddressCity record);

    int updateByPrimaryKey(AddressCity record);

    List<AddressCity> selectByProvinceCode(String provinceCode);
}