package com.example.datong.dao;

import com.example.datong.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //登录
    Admin selectOne(@Param("adminPhone") String adminPhone, @Param("adminPassword")String adminPassword);



}