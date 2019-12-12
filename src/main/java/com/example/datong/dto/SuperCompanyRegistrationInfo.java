package com.example.datong.dto;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.model.Dictionary;

public class SuperCompanyRegistrationInfo extends CompanyRegistrationInfo {
    private String dictionaryName;

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Override
    public String toString() {
        return "SuperCompanyRegistrationInfo{" +
                "dictionaryName='" + dictionaryName + '\'' +
                '}';
    }
}
