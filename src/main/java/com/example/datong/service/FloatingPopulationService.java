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

    //修改个人信息审核状态--通过--未通过
    int changePass(Integer id);
    Map<String,Object> changeNoPass(Integer id, CheckReason reason);

    List<NoPassedPerson> findNoPassed(Integer unitId);

}
