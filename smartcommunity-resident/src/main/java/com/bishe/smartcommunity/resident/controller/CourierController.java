package com.bishe.smartcommunity.resident.controller;

import com.bishe.smartcommunity.resident.domain.Courier;
import com.bishe.smartcommunity.resident.service.CourierService;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courier")
public class CourierController {
    @Autowired
    CourierService courierService;

    /**
     * 列出所有代收快递
     */
    @PostMapping("allCourier")
    public R allCourier(){
        try {
            List<Courier> allCourer = courierService.allCourer();
            return R.success(allCourer);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }
}
