package com.bishe.smartcommunity.resident.service;

import com.bishe.smartcommunity.resident.domain.Courier;

import java.util.List;

public interface CourierService {
    Courier newCourier(Courier courier);

    List<Courier> allCourer();
}
