package com.example.datong.dao;

import com.example.datong.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //登录
    Admin selectOne(String adminPhone,String adminPassword);

    List<Admin> selectByPower(Integer power);

    Admin selectByPhone(String adminPhone);

}