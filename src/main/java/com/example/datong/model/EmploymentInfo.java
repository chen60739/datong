package com.example.datong.model;

public class EmploymentInfo {
    private Integer id;

    private Integer pId;

    private Integer companyId;

    private Integer contractYear;

    private Integer positionalTitleId;

    private Integer skillId;

    private String occupation;

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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getContractYear() {
        return contractYear;
    }

    public void setContractYear(Integer contractYear) {
        this.contractYear = contractYear;
    }

    public Integer getPositionalTitleId() {
        return positionalTitleId;
    }

    public void setPositionalTitleId(Integer positionalTitleId) {
        this.positionalTitleId = positionalTitleId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "EmploymentInfo{" +
                "id=" + id +
                ", pId=" + pId +
                ", companyId=" + companyId +
                ", contractYear=" + contractYear +
                ", positionalTitleId=" + positionalTitleId +
                ", skillId=" + skillId +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}