package com.example.datong.dto;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.model.EmploymentInfo;

public class SuperEmploymentInfo extends EmploymentInfo {
   private   CompanyRegistrationInfo companyRegistrationInfo;

    public CompanyRegistrationInfo getCompanyRegistrationInfo() {
        return companyRegistrationInfo;
    }

    public void setCompanyRegistrationInfo(CompanyRegistrationInfo companyRegistrationInfo) {
        this.companyRegistrationInfo = companyRegistrationInfo;
    }

    @Override
    public String toString() {
        return "SuperEmploymentInfo{" +
                "companyRegistrationInfo=" + companyRegistrationInfo +
                '}';
    }
}
