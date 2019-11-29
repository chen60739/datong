package com.example.datong.pojo;
/*
计划生育信息类
 */
public class FamilyPlanningInfo {
    private Integer id;
    //用户id
    private String pId;
    //夫妻是否同行
    private Boolean isTogether;
    //婚育证明有无
    private Boolean hasProve;
    //婚育证编号
    private String number;
    //婚育证编号验证 是否验证
    private Boolean isChecked;
    //措施时间
    private String measure;
    //怀孕避孕情况
    private Integer pregnancyInfoId;
    //生育男孩人数
    private Integer boyNum;
    //生育女孩人数
    private Integer girlNum;
    //政策内子女数
    private Integer insideNum;
    //政策外子女数
    private Integer outsideNum;
    //有无独生子女证 1 有  0 无
    private Boolean hasCertificate;
    //社会抚养费是否征收 1已缴费 0未缴费
    private Boolean isLevy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Boolean getIsTogether() {
        return isTogether;
    }

    public void setIsTogether(Boolean isTogether) {
        this.isTogether = isTogether;
    }

    public Boolean getHasProve() {
        return hasProve;
    }

    public void setHasProve(Boolean hasProve) {
        this.hasProve = hasProve;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }

    public Integer getPregnancyInfoId() {
        return pregnancyInfoId;
    }

    public void setPregnancyInfoId(Integer pregnancyInfoId) {
        this.pregnancyInfoId = pregnancyInfoId;
    }

    public Integer getBoyNum() {
        return boyNum;
    }

    public void setBoyNum(Integer boyNum) {
        this.boyNum = boyNum;
    }

    public Integer getGirlNum() {
        return girlNum;
    }

    public void setGirlNum(Integer girlNum) {
        this.girlNum = girlNum;
    }

    public Integer getInsideNum() {
        return insideNum;
    }

    public void setInsideNum(Integer insideNum) {
        this.insideNum = insideNum;
    }

    public Integer getOutsideNum() {
        return outsideNum;
    }

    public void setOutsideNum(Integer outsideNum) {
        this.outsideNum = outsideNum;
    }

    public Boolean getHasCertificate() {
        return hasCertificate;
    }

    public void setHasCertificate(Boolean hasCertificate) {
        this.hasCertificate = hasCertificate;
    }

    public Boolean getIsLevy() {
        return isLevy;
    }

    public void setIsLevy(Boolean isLevy) {
        this.isLevy = isLevy;
    }
}