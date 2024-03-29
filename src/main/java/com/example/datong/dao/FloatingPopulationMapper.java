package com.example.datong.dao;

import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.FloatingPopulation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface FloatingPopulationMapper {
    int updatePass(Integer id);

    int updateNoPass(@Param("reasonId") Integer reasonId,@Param("id")Integer id);
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
    int selectCountByProvince(HashMap map);

    /**
     * 查询个人登记信息审核
     * @param unitName 单位名称
     * @param name 人名
     * @param phone 手机号
     * @param time1 起止时间
     * @param time2 结束时间
     * @return
     */
    List<FloatingPopulation> selectAll(@Param("unitName") String unitName,
                                       @Param("name") String name,
                                       @Param("phone") String phone,
                                       @Param("time1") String time1,
                                       @Param("time2") String time2,
                                       @Param("offest") Integer offest,
                                       @Param("limit") Integer limit);
    int selectAllCount(@Param("unitName") String unitName, @Param("name") String name, @Param("phone") String phone,@Param("time1") String time1,@Param("time2") String time2);

    List<FloatingPopulation> selectChecking(@Param("stateCode") Integer stateCode,
                                            @Param("unitId") Integer unitId,
                                            @Param("offest") Integer offest,
                                            @Param("limit") Integer limit);

    int selectCheckingCount(@Param("stateCode") Integer stateCode, @Param("unitId") Integer unitId);

    List<NoPassedPerson> selectNoPassed(@Param("unitId") Integer unitId,
                                        @Param("offest") Integer offest,
                                        @Param("limit") Integer limit);

    int selectNoPassedCount(Integer unitId);



}