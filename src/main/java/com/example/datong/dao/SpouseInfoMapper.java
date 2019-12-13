package com.example.datong.dao;

import com.example.datong.model.SpouseInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpouseInfoMapper {
    /**
     * 根据个人id查询配偶
     * @param pid
     * @return 配偶类对象
     */
    SpouseInfo selectByPid(Integer pid);

    int deleteByPrimaryKey(Integer id);

    int insert(SpouseInfo record);

    int insertSelective(SpouseInfo record);

    SpouseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpouseInfo record);

    int updateByPrimaryKey(SpouseInfo record);
}