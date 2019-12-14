package com.example.datong.service;

import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     * 查询登记信息审核
     * @param unitName
     * @param name
     * @param phone
     * @param time1
     * @param time2
     * @return
     */
    Map<String,Object> findAll(String unitName,String name,String phone,String time1,String time2,Integer page,Integer limit);

    /**
     * 修改个人信息审核状态--通过--未通过
     * @param id
     * @return
     */
    //int changePass(Integer id);
    Map<String,Object> changeNoPass(Integer id, CheckReason reason);

    Map<String, Object> findNoPassed(Integer unitId);

    /**
     * 流动人口统计
     * @param model
     * @param county
     * @param town
     * @param create_time1
     * @param create_time2
     * @return
     */
    Model findModel(Model model, String county, String town, String create_time1, String create_time2);

}
