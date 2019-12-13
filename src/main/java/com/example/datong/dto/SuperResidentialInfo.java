package com.example.datong.dto;

import com.example.datong.model.LessorInfo;
import com.example.datong.model.ResidentialInfo;

public class SuperResidentialInfo extends ResidentialInfo {
    private LessorInfo lessorInfo;

    public LessorInfo getLessorInfo() {
        return lessorInfo;
    }

    public void setLessorInfo(LessorInfo lessorInfo) {
        this.lessorInfo = lessorInfo;
    }

    @Override
    public String toString() {
        return "SuperResidentialInfo{" +
                "lessorInfo=" + lessorInfo +
                '}';
    }
}
