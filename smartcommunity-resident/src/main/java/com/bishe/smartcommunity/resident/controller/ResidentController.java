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
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/resident")
public class ResidentController {
    private ResidentService residentService;
    private CourierService courierService;
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
    @RequestMapping("/importResident-xlsx")
    public R importResident(@RequestParam(value = "multipartFile") MultipartFile multipartFile){
        try {
            FileInputStream inputStream = (FileInputStream) multipartFile.getInputStream();
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
            //记录每一行的数据，并记录错误的行数
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            ArrayList<Resident> list = new ArrayList<>();
            ArrayList<Integer> err = new ArrayList<>();
            for (int rowIndex=1; rowIndex<=sheet.getLastRowNum(); rowIndex++){
                XSSFRow row = sheet.getRow(rowIndex);
                Resident resident = new Resident();
                if(row==null){
                    continue;
                }
                XSSFCell nameCell = row.getCell(0);
                XSSFCell pwdcell = row.getCell(1);
                XSSFCell phonecell = row.getCell(2);
                phonecell.getNumericCellValue();
                phonecell.setCellType(CellType.STRING);
                if(phonecell.getStringCellValue().length() != 11){
                    err.add(rowIndex+1);
                }
                resident.setResidentName(nameCell.getStringCellValue());
                resident.setResidentPwd(pwdcell.getStringCellValue());
                resident.setResidentPhone(phonecell.getStringCellValue());
                resident.setResidentCreated(new Date());
                list.add(resident);
            }
            xssfWorkbook.close();
            inputStream.close();

            try {
                if(list!=null){
                    if (err.size()!=0){
                        return R.error("添加失败，错误行数："+err.toString());
                    }else {
                        return R.success("添加成功人数："+residentService.importResident((List<Resident>) list));
                    }
                }else {
                    return R.error("请添加住户数据!");
                }
            } catch (Exception e) {
                return R.error(e.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.error("导入失败！");

    }

}
