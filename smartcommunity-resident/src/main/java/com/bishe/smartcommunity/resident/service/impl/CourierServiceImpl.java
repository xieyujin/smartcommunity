package com.bishe.smartcommunity.resident.service.impl;

import com.bishe.smartcommunity.resident.domain.Courier;
import com.bishe.smartcommunity.resident.domain.CourierExample;
import com.bishe.smartcommunity.resident.mapper.CourierMapper;
import com.bishe.smartcommunity.resident.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourierServiceImpl implements CourierService {
    @Autowired
    private CourierMapper courierMapper;
    private CourierExample courierExample;

    @Override
    public Courier newCourier(Courier courier) {
        int insert = courierMapper.insert(courier);
        System.out.println(insert);
        return courier;
    }

    @Override
    public List<Courier> allCourer() {
        CourierExample.Criteria criteria = courierExample.createCriteria();
        criteria.andCourierStateEqualTo(1);
        List<Courier> couriers = courierMapper.selectByExample(courierExample);
        return couriers;
    }
}
