package com.example.datong.model;

public class InsuranceState {
    private Integer id;

    private Integer pId;

    //保险类型id
    private Integer insuranceId;

    public InsuranceState() {
    }

    public InsuranceState(Integer pId, Integer insuranceId) {
        this.pId = pId;
        this.insuranceId = insuranceId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }
}