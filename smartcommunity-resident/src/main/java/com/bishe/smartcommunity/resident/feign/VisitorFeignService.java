package com.bishe.smartcommunity.resident.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("smartcommunity-visitor")
public interface VisitorFeignService {

}
