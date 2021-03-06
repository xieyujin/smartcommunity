package com.bishe.smartcommunity.vehicle.controller;

import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import com.bishe.smartcommunity.vehicle.domain.Vehicle;
import com.bishe.smartcommunity.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/newVehicle")
    public R newVehicle(@RequestBody Vehicle vehicle){
        try {
            Vehicle newVehicle = vehicleService.newVehicle(vehicle);
            return R.success(vehicle);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

    @PostMapping("allVehicles")
    public R allVehicle(){
        List<Vehicle> allVehicle = vehicleService.allVehicle();
        return R.success(allVehicle);
    }
}
