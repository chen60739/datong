package com.example.datong.dao;

import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.FloatingPopulation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FloatingPopulationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FloatingPopulation record);

    int insertSelective(FloatingPopulation record);

    FloatingPopulation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FloatingPopulation record);

    int updateByPrimaryKey(FloatingPopulation record);
    //根据省份查询人数
    int selectCountByProvince(String provinceCode);

    /**查找审核中或通过审核的
     * @param stateCode 审核状态码
     * @param unitId 公司Id
     * @return
     */
    List<FloatingPopulation> selectChecking(@Param("stateCode") Integer stateCode,@Param("unitId") Integer unitId);


    int selectCheckingCount(@Param("stateCode") Integer stateCode,@Param("unitId") Integer unitId);

    List<NoPassedPerson> selectNoPassed(Integer unitId);

    int selectNoPassedCount(Integer unitId);

    //查询个人登记信息审核
    List<FloatingPopulation> selectAll(@Param("unitName") String unitName, @Param("name") String name, @Param("phone") String phone,@Param("time1") String time1,@Param("time2") String time2);

    //修改个人信息登入审核状态--审核通过
    int updatePass(Integer id);
    int updateNoPass(Integer id);

}