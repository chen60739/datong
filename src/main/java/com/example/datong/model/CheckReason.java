package com.example.datong.model;

public class CheckReason {
    private Integer id;

    private Integer adminId;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getadminId() {
        return adminId;
    }

    public void setadminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    @Override
    public String toString() {
        return "CheckReason{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", reason='" + reason + '\'' +
                '}';
    }
}