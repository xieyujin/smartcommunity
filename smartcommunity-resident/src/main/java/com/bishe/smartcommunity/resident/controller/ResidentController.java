package com.bishe.smartcommunity.resident.controller;

import com.bishe.smartcommunity.resident.domain.Courier;
import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.Task;
import com.bishe.smartcommunity.resident.service.CourierService;
import com.bishe.smartcommunity.resident.service.ResidentService;
import com.bishe.smartcommunity.resident.service.TaskService;
import com.bishe.smartcommunity.resident.utils.ResidentTokenVo;
import com.bishe.smartcommunity.resident.utils.TaskVo;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/resident")
public class ResidentController {
    @Autowired
    private ResidentService residentService;
    @Autowired
    private CourierService courierService;
    @Autowired
    private TaskService taskService;

    //登录
    @PostMapping("/login")
    public R login(@RequestBody ResidentTokenVo tokenVo) {
        if (tokenVo.getValidTime() == null) tokenVo.setValidTime(500);
        Resident residentByName = residentService.findResidentByName(tokenVo.getResident().getResidentName());
        if (residentByName == null) return R.message(-1, "", "用户名错误");

        try {
            Resident resident = residentService.loginResident(tokenVo.getResident());
            System.out.println(resident);
            if (resident == null) return R.message(-2, "", "密码错误");
            if (resident != null) {
                String token = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                ObjectMapper mapper = new ObjectMapper();
                tokenVo.setResident(resident);
                System.out.println(token);
                return R.message(0, token, "登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(e.getMessage());
        }
        return R.message(-3,"","系统错误");
    }
    //发起报修任务
    @PostMapping("/newTask")
    public R newTask(@RequestBody TaskVo taskVo){
        try {
            if(taskVo.getResident().getResidentId()==1) {
                Task task = taskService.newtask(taskVo.getResident(), taskVo.getTask());
                return R.success(task);
            }else {
                return R.error("您不是小区的住户，没有发起的权限");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return R.error(e.getMessage());
        }
    }

    //修改住户信息
    @PostMapping("/modify")
    public R modifyResident(@RequestBody Resident resident){
        try {
            Resident modifiedResident = residentService.modifyResident(resident);
            return R.success(modifiedResident);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

    //发起代收快递
    @PostMapping("/newCourier")
    public R newCourier(@RequestBody Courier courier){
        try {
            Courier newCourier = courierService.newCourier(courier);
            return R.success(newCourier);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

    //批量添加住户
    @PostMapping("/importResident-xlsx")
    public R importResident(@RequestParam(value = "multipartFile") MultipartFile multipartFile){
        R r = residentService.importResident(multipartFile);
        return r;

    }

    //查看所有住户
    @PostMapping("/listAllResidents")
    public R listAllResidents(@RequestBody String str){


            System.out.println(str);
            List<Resident> allResidents = residentService.findAllResidents();
            System.out.println(1);
            return R.success(allResidents);

    }


}
