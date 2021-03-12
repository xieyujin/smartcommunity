package com.bishe.smartcommunity.property.service.impl;

import com.bishe.smartcommunity.property.domain.Property;
import com.bishe.smartcommunity.property.mapper.PropertyMapper;
import com.bishe.smartcommunity.property.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public String noticeboard(Property property, String str) {
        property.setPropertyNotice(str);
        int update = propertyMapper.updateByPrimaryKeySelective(property);
        System.out.println(update);
        if (update==0){
            return null;
        }else {
            Property property1 = propertyMapper.selectByPrimaryKey(property.getPropertyId());
            System.out.println(property1);
            return property1.getPropertyNotice();
        }
    }

    @Override
    public List<Property> allProperties() {
        List<Property> allProperties = propertyMapper.findAllProperties();
        return allProperties;
    }
}
