package com.bishe.smartcommunity.property.utils;

import com.bishe.smartcommunity.property.domain.Property;

public class NoticeVo {
    private Property property;
    private String str;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public NoticeVo(Property property, String str) {
        super();
        this.property = property;
        this.str = str;
    }

    @Override
    public String toString() {
        return "NoticeVo{" +
                "property=" + property +
                ", str='" + str + '\'' +
                '}';
    }
}
