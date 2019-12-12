package com.example.datong.service;

import com.example.datong.dao.*;
import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class FloatingPopulationImpl implements FloatingPopulationService {

    @Autowired
    private FloatingPopulationMapper populationMapper;
    @Autowired
    private InsuranceStateMapper insuranceStateMapper;
    @Autowired
    private EmploymentInfoMapper employmentInfoMapper;
    @Autowired
    private CompanyRegistrationInfoMapper companyRegistrationInfoMapper;
    @Autowired
    private FamilyMemberToghterMapper familyMemberToghterMapper;
    @Autowired
    private FamilyPlanningInfoMapper familyPlanningInfoMapper;
    @Autowired
    private LessorInfoMapper lessorInfoMapper;
    @Autowired
    private SpouseInfoMapper spouseInfoMapper;
    @Autowired
    private ResidentialInfoMapper residentialInfoMapper;
    @Autowired
    private FertilityInfoMapper fertilityInfoMapper;

    @Override
    public List<NoPassedPerson> findNoPassed(Integer unitId) {
        List<NoPassedPerson> list = populationMapper.selectNoPassed(unitId);
        return list;
    }

    @Override
    public Map<String, Object> findChecking(Integer stateCode,Integer unitId) {
        List<FloatingPopulation> list = populationMapper.selectChecking(stateCode,unitId);
        int count = populationMapper.selectNotCheckedCount(unitId);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("data",list);
        return map;
    }

    @Override
    public void addPerson(FloatingPopulation floatingPopulation,
                          String time, String childBirthdayStr,
                          String insuranceIds,
                          CompanyRegistrationInfo companyRegistrationInfo,
                          EmploymentInfo employmentInfo,
                          String familyMember,
                          FamilyPlanningInfo familyPlanningInfo,
                          FertilityInfo fertilityInfo, LessorInfo lessorInfo,
                          SpouseInfo spouseInfo, ResidentialInfo residentialInfo) throws ParseException {



        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date comeTime = format.parse(time);
        floatingPopulation.setComeTime(comeTime);
        floatingPopulation.setGmtCreate(new Date());
        floatingPopulation.setGmtModified(new Date());
        int i = populationMapper.insert(floatingPopulation);
        if (i == 1) {
            String[] ids = insuranceIds.split(",");
            for (String id : ids) {
                insuranceStateMapper.insert(new InsuranceState(floatingPopulation.getId(), Integer.parseInt(id)));
            }
            employmentInfo.setpId(floatingPopulation.getId());
            employmentInfo.setCompanyId(companyRegistrationInfo.getUnitId());
            employmentInfoMapper.insert(employmentInfo);
            companyRegistrationInfo.setGmtModified(new Date());
            companyRegistrationInfoMapper.updateByPrimaryKeySelective(companyRegistrationInfo);
            if (familyMember != "") {
                String[] members = familyMember.split(",");
                for (String member : members) {
                    String[] one = member.split("-");
                    FamilyMemberToghter familyMemberToghter = new FamilyMemberToghter();
                    familyMemberToghter.setRelationId(Integer.parseInt(one[0]));
                    familyMemberToghter.setMemberName(one[1]);
                    familyMemberToghter.setMemberIdCard(one[2]);
                    familyMemberToghter.setMemberSex(parseBoolean(one[3]));
                    familyMemberToghter.setHasVaccinate(parseBoolean(one[4]));
                    familyMemberToghter.setIsLocal(parseBoolean(one[5]));
                    familyMemberToghter.setpId(floatingPopulation.getId());
                    familyMemberToghterMapper.insert(familyMemberToghter);
                }
            }
            if (familyPlanningInfo.getNumber() != null) {
                familyPlanningInfo.setpId(floatingPopulation.getId());
                familyPlanningInfoMapper.insert(familyPlanningInfo);
            }
            lessorInfo.setpId(floatingPopulation.getId());
            lessorInfoMapper.insert(lessorInfo);
            if (spouseInfo.getSpouseName() != null) {
                spouseInfo.setpId(floatingPopulation.getId());
                spouseInfoMapper.insert(spouseInfo);
            }
            residentialInfo.setpId(floatingPopulation.getId());
            residentialInfoMapper.insert(residentialInfo);
            if (childBirthdayStr != "") {
                Date childBirthday = format.parse(childBirthdayStr);
                fertilityInfo.setChildBirthday(childBirthday);
                fertilityInfo.setpId(floatingPopulation.getId());
                fertilityInfoMapper.insert(fertilityInfo);
            }
        }

    }

    private boolean parseBoolean(String s){
        boolean returnValue = false;
        if("1".equalsIgnoreCase(s) || "true".equalsIgnoreCase(s)){
            returnValue = true;
        }
        return returnValue;
    }
}
