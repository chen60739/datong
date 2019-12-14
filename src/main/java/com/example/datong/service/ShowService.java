package com.example.datong.service;

import com.example.datong.dto.SuperEmploymentInfo;
import com.example.datong.dto.SuperResidentialInfo;
import com.example.datong.model.*;
import java.util.List;


public interface ShowService {
    //公司不通过
    int replayCompanyNoPass(Integer unitId);

    int replayCheckedByCompanyId(Integer unitId);


    Integer[] findInsuranceState(Integer id);
    CheckReason getCheckedReason(Integer id);

    int replayReason(Integer id, String reason);

    void replayPass(String[] id);
    void replayNoPass(String[] id);
    /**
     * 添加未通过原因
     * @param checkReason
     * @return
     */
    int addReason(CheckReason checkReason);
    /**
     * 通过countyCode找到 省 和 市
     * @param countyCode
     * @return
     */
    AddressProvince getSpouseAddress(String countyCode);

    SuperResidentialInfo getResidentialInfo(Integer id);

    SuperEmploymentInfo getEmploymentInfo(Integer id);

    String getProvinceByCity(String code);

    List<AddressTown> findTown();

    List<AddressCounty>  findCounty();

    List<AddressCity>  findCity();

    List<AddressProvince> findProvince();

    List<Dictionary> findDictionary();

    AddressProvince getAddressByTownCode(String townCode);

    FloatingPopulation getPeopleSelf(Integer id);

    List<FertilityInfo> findFertilityInfoById(Integer id);

    FamilyPlanningInfo getPlanningInfoById(Integer id);

    List<FamilyMemberToghter> findById(Integer id);

    SpouseInfo getByPid(Integer pid);

    List<FloatingPopulation> findPeople(String unitName, String time, String time2, String name, Integer phone);
}
