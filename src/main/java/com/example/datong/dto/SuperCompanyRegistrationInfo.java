package com.example.datong.dto;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.model.Dictionary;

public class SuperCompanyRegistrationInfo extends CompanyRegistrationInfo {
    private Dictionary dictionary;

    public SuperCompanyRegistrationInfo(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "SuperCompanyRegistrationInfo{" +
                "dictionary=" + dictionary +
                '}';
    }
}
