package com.example.datong.dto;

import com.example.datong.model.*;

import java.util.Date;

public class SuperFloatingPopulation extends FloatingPopulation{


    private CompanyRegistrationInfo companyRegistrationInfo;
    private Dictionary dictionary;


    public SuperFloatingPopulation(CompanyRegistrationInfo companyRegistrationInfo, Dictionary dictionary) {
        this.companyRegistrationInfo = companyRegistrationInfo;
        this.dictionary = dictionary;
    }

    public SuperFloatingPopulation(Integer id, String name, String nameUsedBefore, Boolean sex, String photo, String idCard, String fixedPhone, String householdCityCode, String phone, Integer nationId, Date comeTime, Integer educationLevelId, Integer politicalOutlookId, Integer faithId, Double height, Double weight, Integer bloodTypeId, Integer healthy, String disabilityCode, Integer employmentStateId, Integer maritalStateId, Boolean isDel, Boolean state, Date gmtCreate, String gmtCreateStr, Date gmtModified, String gmtModifiedStr, Integer isChecked, Integer checkReasonId, Integer companyId, AddressCity addressCitys, ResidentialInfo residentialInfo, AddressTown addressTown, AddressCounty addressCounty, CompanyRegistrationInfo companyRegistrationInfo, Dictionary dictionary) {
        super(id, name, nameUsedBefore, sex, photo, idCard, fixedPhone, householdCityCode, phone, nationId, comeTime, educationLevelId, politicalOutlookId, faithId, height, weight, bloodTypeId, healthy, disabilityCode, employmentStateId, maritalStateId, isDel, state, gmtCreate, gmtCreateStr, gmtModified, gmtModifiedStr, isChecked, checkReasonId, companyId, addressCitys, residentialInfo, addressTown, addressCounty);
        this.companyRegistrationInfo = companyRegistrationInfo;
        this.dictionary = dictionary;
    }

    public CompanyRegistrationInfo getCompanyRegistrationInfo() {
        return companyRegistrationInfo;
    }

    public void setCompanyRegistrationInfo(CompanyRegistrationInfo companyRegistrationInfo) {
        this.companyRegistrationInfo = companyRegistrationInfo;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "SuperFloatingPopulation{" +
                "companyRegistrationInfo=" + companyRegistrationInfo +
                ", dictionary=" + dictionary +
                '}';
    }
}
