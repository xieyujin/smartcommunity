package com.bishe.smartcommunity.property.service;

import com.bishe.smartcommunity.property.domain.Property;

import java.util.List;

public interface PropertyService {
    String noticeboard(Property property, String str);

    List<Property> allProperties();
}
