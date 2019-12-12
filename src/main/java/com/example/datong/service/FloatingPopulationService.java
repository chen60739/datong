package com.example.datong.service;

import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface FloatingPopulationService {
    void addPerson(FloatingPopulation floatingPopulation,String time,
                   String childBirthdayStr, String insuranceIds,
                   CompanyRegistrationInfo companyRegistrationInfo,
                   EmploymentInfo employmentInfo,
                   String familyMember,
                   FamilyPlanningInfo familyPlanningInfo,FertilityInfo fertilityInfo,
                   LessorInfo lessorInfo,SpouseInfo spouseInfo,
                   ResidentialInfo residentialInfo) throws ParseException;

    Map<String, Object> findChecking(Integer stateCode,Integer unitId);

    //查询登记信息审核
    Map<String,Object> findAll(String unitName,String name,String phone,String time1,String time2);

    //修改个人信息审核状态--通过--未通过
    int changePass(Integer id);
    Map<String,Object> changeNoPass(Integer id, CheckReason reason);

    Map<String, Object> findNoPassed(Integer unitId);

}
