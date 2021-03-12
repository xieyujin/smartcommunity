package com.bishe.smartcommunity.vehicle.service;

import com.bishe.smartcommunity.vehicle.domain.Vehicle;

import java.util.List;

public interface VehicleService {
    public Vehicle newVehicle(Vehicle vehicle);

    List<Vehicle> allVehicle();
}
