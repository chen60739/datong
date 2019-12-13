package com.example.datong.dao;

import com.example.datong.model.FloatingPopulation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FloatingPopulationMapper {
    int updatePass(Integer id);

    int updateNoPass(Integer id);
    /**
     * 通过人id查询个人信息
     * @param id
     * @return 个人信息对象
     */
    FloatingPopulation selectSelf(Integer id);

    /**
     * 查询所有流动人信息
     * @return 返回流动人口集合
     *
     */
    List<FloatingPopulation> selectPeople(String unitName, String time, String time2, String name, Integer phone);

    int deleteByPrimaryKey(Integer id);

    int insert(FloatingPopulation record);

    int insertSelective(FloatingPopulation record);

    FloatingPopulation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FloatingPopulation record);

    int updateByPrimaryKey(FloatingPopulation record);
    //根据省份查询人数
    int selectCountByProvince(String provinceCode);
}