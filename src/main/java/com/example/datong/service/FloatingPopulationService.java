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

    List<NoPassedPerson> findNoPassed(Integer unitId);

}
