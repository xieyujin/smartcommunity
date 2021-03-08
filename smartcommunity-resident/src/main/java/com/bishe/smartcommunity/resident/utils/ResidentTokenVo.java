package com.bishe.smartcommunity.resident.utils;

import com.bishe.smartcommunity.resident.domain.Resident;

public class ResidentTokenVo {
    private Resident resident;
    private Integer validTime;

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public ResidentTokenVo(Resident resident,Integer validTime) {
        super();
        this.resident = resident;
        this.validTime = validTime;
    }

    @Override
    public String toString() {
        return "ResidentTokenVo{" +
                "resident=" + resident +
                ", validTime=" + validTime +
                '}';
    }
}
