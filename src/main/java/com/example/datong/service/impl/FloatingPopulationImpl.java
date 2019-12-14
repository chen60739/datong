package com.example.datong.service.impl;

import com.example.datong.dao.*;
import com.example.datong.dto.NoPassedPerson;
import com.example.datong.model.*;
import com.example.datong.service.AddressService;
import com.example.datong.service.FloatingPopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import javax.annotation.Resource;
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
    @Resource
    FloatingPopulationMapper floatingPopulationMapper;
    @Resource
    CheckReasonMapper checkReasonMapper;
    @Autowired
    private AddressService addressService;

    /*@Override
    public int changePass(Integer id) {
        return floatingPopulationMapper.updatePass(id);
    }*/

    @Override
    @Transactional
    public Map<String,Object> changeNoPass(Integer id,CheckReason reason) {
        HashMap<String ,Object> map=new HashMap<>();
        CheckReason checkReason = checkReasonMapper.selectOne(id);
        if(checkReason != null){
            map.put("error","已存在原因");
        }else {
            checkReasonMapper.insertrecord(reason);
            //floatingPopulationMapper.updateNoPass(id);
            map.put("success","添加成功");
        }
        return map;

    }

    @Override
    public Map<String,Object> findAll(String unitName,String name,String phone,String time1,String time2) {
        HashMap<String,Object> map = new HashMap<>();
        List<FloatingPopulation> floatingPopulations = floatingPopulationMapper.selectAll( unitName,name, phone,time1,time2);
        map.put("data",floatingPopulations);
        map.put("code",0);
        return map;
    }


    @Override
    public Map<String, Object> findNoPassed(Integer unitId) {
        List<NoPassedPerson> list = populationMapper.selectNoPassed(unitId);
        int count = populationMapper.selectNoPassedCount(unitId);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("data",list);
        return map;
    }

    @Override
    public Map<String, Object> findChecking(Integer stateCode,Integer unitId) {
        List<FloatingPopulation> list = populationMapper.selectChecking(stateCode,unitId);
        int count = populationMapper.selectCheckingCount(stateCode,unitId);
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
            companyRegistrationInfoMapper.updateByPrimaryKey(companyRegistrationInfo);
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

    @Override
    public Model findModel(Model model, String county, String town, String Create_time1, String Create_time2) {
        //查询省份
        List<AddressProvince> list= addressService.getProvice();
        List<Integer> rs=new ArrayList<>();
        List<String> ps=new ArrayList<>();
        HashMap<String,Object> map=new HashMap<>();
        map.put("county",county);
        map.put("town",town);
        if(Create_time1!=null && !"".equals(Create_time1)){
            map.put("time1",Create_time1);
            map.put("time2",Create_time2);
        }
        for (AddressProvince province:list ) {
            //通过省份查询人数
            map.put("provinceCode",province.getProvinceCode());
            int count= floatingPopulationMapper.selectCountByProvince(map);
            rs.add(count);
            ps.add(province.getProvinceName());

        }
        model.addAttribute("rs",rs);
        model.addAttribute("provinces",ps);
        model.addAttribute("Create_time1",Create_time1);
        model.addAttribute("Create_time2",Create_time2);
        model.addAttribute("county",county);
        model.addAttribute("town",town);
        return model;
    }

    private boolean parseBoolean(String s){
        boolean returnValue = false;
        if("1".equalsIgnoreCase(s) || "true".equalsIgnoreCase(s)){
            returnValue = true;
        }
        return returnValue;
    }
}
