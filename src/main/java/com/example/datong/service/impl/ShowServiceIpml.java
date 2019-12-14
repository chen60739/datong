package com.example.datong.service.impl;

import com.example.datong.dao.*;
import com.example.datong.dto.SuperEmploymentInfo;
import com.example.datong.dto.SuperResidentialInfo;
import com.example.datong.model.*;
import com.example.datong.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShowServiceIpml implements ShowService {

    @Autowired
    FloatingPopulationMapper floatingPopulationMapper;
    @Autowired
    SpouseInfoMapper spouseInfoMapper;
    @Autowired
    FamilyMemberToghterMapper familyMemberToghterMapper;
    @Autowired
    FamilyPlanningInfoMapper familyPlanningInfoMapper;
    @Autowired
    FertilityInfoMapper fertilityInfoMapper;
    @Autowired
    AddressProvinceMapper addressProvinceMapper;
    @Autowired
    AddressCityMapper addressCityMapper;
    @Autowired
    AddressCountyMapper addressCountyMapper;
    @Autowired
    DictionaryMapper dictionaryMapper;
    @Autowired
    EmploymentInfoMapper employmentInfoMapper;
    @Autowired
    AddressTownMapper addressTownMapper;
    @Autowired
    ResidentialInfoMapper residentialInfoMapper;
    @Autowired
    CheckReasonMapper checkReasonMapper;
    @Autowired
    InsuranceStateMapper insuranceStateMapper;
    @Autowired
    CompanyRegistrationInfoMapper companyRegistrationInfoMapper;

    @Override
    public int replayCompanyNoPass(Integer unitId) {
        return companyRegistrationInfoMapper.updateCompanyNoPass(unitId);
    }

    @Override
    public int replayCheckedByCompanyId(Integer unitId) {
        return companyRegistrationInfoMapper.updateCheckedByCompanyId(unitId);
    }

    @Override
    public Integer[] findInsuranceState(Integer id) {
        return insuranceStateMapper.selectInsuranceState(id);
    }

    @Override
    public CheckReason getCheckedReason(Integer id) {
        return checkReasonMapper.selectByAccountId(id);
    }

    @Override
    public int replayReason(Integer id,String reason) {
        return checkReasonMapper.updateByAccountId(id,reason);
    }

    @Override
    public void replayPass(String[] id) {
        if (id != null) {
            for (String s : id) {
                floatingPopulationMapper.updatePass(Integer.parseInt(s));
            }
        }
    }

    @Override
    public void replayNoPass(String[] id) {
        if (id != null) {
            for (String s : id) {
                floatingPopulationMapper.updateNoPass(Integer.parseInt(s));
            }
        }
    }

    @Override
    public int addReason(CheckReason checkReason) {
        return checkReasonMapper.insertSelective(checkReason);
    }

    @Override
    public AddressProvince getSpouseAddress(String countyCode) {
        return addressProvinceMapper.selectSpouseAddress(countyCode);
    }

    @Override
    public SuperResidentialInfo getResidentialInfo(Integer id) {
        return residentialInfoMapper.selectResidentialInfo(id);
    }

    @Override
    public SuperEmploymentInfo getEmploymentInfo(Integer id) {
        return employmentInfoMapper.selectEmploymentInfo(id);
    }

    @Override
    public String getProvinceByCity(String code) {
        return addressCityMapper.selectProvinceByCityCode(code);
    }

    @Override
    public List<AddressTown> findTown() {
        return addressTownMapper.selectTown();
    }

    @Override
    public List<AddressCounty> findCounty() {
        return addressCountyMapper.selectCounty();
    }

    @Override
    public List<AddressCity> findCity() {
        return addressCityMapper.selectCity();
    }

    @Override
    public List<AddressProvince> findProvince() {
        return addressProvinceMapper.selectAllProvince();
    }

    @Override
    public List<Dictionary> findDictionary() {
        return dictionaryMapper.selectDictionary();
    }

    @Override
    public AddressProvince getAddressByTownCode(String townCode) {
        return addressProvinceMapper.selectCodeName(townCode);
    }

    @Override
    public FloatingPopulation getPeopleSelf(Integer id) { return floatingPopulationMapper.selectSelf(id); }

    @Override
    public List<FertilityInfo> findFertilityInfoById(Integer id) { return fertilityInfoMapper.selectFertilityInfoById(id); }

    @Override
    public FamilyPlanningInfo getPlanningInfoById(Integer id) {  return familyPlanningInfoMapper.selectPlanningInfo(id); }

    @Override
    public List<FamilyMemberToghter> findById(Integer id) {
        return  familyMemberToghterMapper.selectById(id);
    }

    @Override
    public SpouseInfo getByPid(Integer pid) { SpouseInfo spouseInfo=spouseInfoMapper.selectByPid(pid);
        return spouseInfo;
    }

    @Override
    public List<FloatingPopulation> findPeople(String unitName,String time,String time2,String name,Integer phone) {
        return floatingPopulationMapper.selectPeople(unitName,time,time2,name,phone);
    }
}
