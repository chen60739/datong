package com.example.datong.dto;

import com.example.datong.model.FloatingPopulation;

public class SuperFloatingPopulation extends FloatingPopulation{


    private String unitName;
    private String dictionaryName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    @Override
    public String toString() {
        return "SuperFloatingPopulation{" +
                "unitName='" + unitName + '\'' +
                ", dictionaryName='" + dictionaryName + '\'' +
                '}';
    }
}
