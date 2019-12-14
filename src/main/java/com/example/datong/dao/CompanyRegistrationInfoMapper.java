package com.example.datong.dao;

import com.example.datong.model.CompanyRegistrationInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyRegistrationInfoMapper {
    int updateCompanyNoPass(Integer unitId);

    int deleteByPrimaryKey(Integer unitId);

    int insert(CompanyRegistrationInfo record);

    int insertSelective(CompanyRegistrationInfo record);

    CompanyRegistrationInfo selectByCompanyId(Integer unitId);

    int updateCheckedByCompanyId(Integer unitId );

    int updateByPrimaryKey(CompanyRegistrationInfo record);
    int updateByPrimaryKeySelective(CompanyRegistrationInfo record);

    CompanyRegistrationInfo findByPhone(String username);

    /**
     * 注册信息审核查询
     * @param companyRegistrationInfo
     * @return
     */
    List<CompanyRegistrationInfo> selectAll(@Param("company") CompanyRegistrationInfo company, @Param("offest") Integer offest, @Param("limit") Integer limit);

    int selectAllCount(CompanyRegistrationInfo companyRegistrationInfo);
}