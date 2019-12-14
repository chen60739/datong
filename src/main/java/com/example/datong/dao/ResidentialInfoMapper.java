package com.example.datong.dao;

import com.example.datong.dto.SuperResidentialInfo;
import com.example.datong.model.ResidentialInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ResidentialInfoMapper {

    SuperResidentialInfo selectResidentialInfo(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(ResidentialInfo record);

    int insertSelective(ResidentialInfo record);

    ResidentialInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResidentialInfo record);

    int updateByPrimaryKey(ResidentialInfo record);
}