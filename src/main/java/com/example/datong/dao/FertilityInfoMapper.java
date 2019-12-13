package com.example.datong.dao;

import com.example.datong.model.FertilityInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FertilityInfoMapper {
    /**
     * 通过个人id查询孩子信息
     * @param id
     * @return  孩子信息集合
     */
    List<FertilityInfo> selectFertilityInfoById(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(FertilityInfo record);

    int insertSelective(FertilityInfo record);

    FertilityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FertilityInfo record);

    int updateByPrimaryKey(FertilityInfo record);
}