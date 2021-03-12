package com.bishe.smartcommunity.vehicle.service.impl;

import com.bishe.smartcommunity.vehicle.domain.Vehicle;
import com.bishe.smartcommunity.vehicle.mapper.VehicleMapper;
import com.bishe.smartcommunity.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleMapper vehicleMapper;
    @Override
    public Vehicle newVehicle(Vehicle vehicle) {
        int i = vehicleMapper.insert(vehicle);
        System.out.println(i);
        return vehicle;
    }

    @Override
    public List<Vehicle> allVehicle() {
        List<Vehicle> allVehicles = vehicleMapper.findAllVehicles();
        return allVehicles;
    }
}
