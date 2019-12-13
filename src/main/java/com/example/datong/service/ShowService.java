package com.example.datong.service;

import com.example.datong.model.*;
import java.util.List;


public interface ShowService {
    /**
     * 通过市code找到下面的县
     * @param code
     * @return
     */
    List<AddressCounty> findCountyBy(String code);

    /**
     * 通过县/区code找到下面的镇/街
     * @param code
     * @return
     */
    List<AddressTown> findTownByCode(String code);

    /**
     * 通过省code找到下面的市
     * @param code
     * @return city集合对象
     */
    List<AddressCity> findCityBy(String code);

    Integer[] findInsuranceState(Integer id);
    CheckReason getCheckedReason(Integer id);

    int replayReason(Integer id, String reason);

    int replayPass(Integer id);
    int replayNoPass(Integer id);
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

    ResidentialInfo getResidentialInfo(Integer id);

    EmploymentInfo getEmploymentInfo(Integer id);

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
