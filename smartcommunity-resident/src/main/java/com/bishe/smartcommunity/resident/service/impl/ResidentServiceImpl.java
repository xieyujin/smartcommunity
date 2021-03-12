package com.bishe.smartcommunity.resident.service.impl;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.ResidentExample;
import com.bishe.smartcommunity.resident.mapper.ResidentMapper;
import com.bishe.smartcommunity.resident.service.ResidentService;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ResidentServiceImpl implements ResidentService {

    @Autowired
    private ResidentExample residentExample;
    @Autowired
    private ResidentMapper residentMapper;

    @Override
    public Resident findResidentByName(String residentName) {
        ResidentExample.Criteria criteria = residentExample.createCriteria();
        criteria.andResidentNameEqualTo(residentName);
        List<Resident> residents = residentMapper.selectByExample(residentExample);
        System.out.println(residents);
        residentExample.clear();
        return residents.get(0);
    }

    @Override
    public Resident loginResident(Resident resident) {
        ResidentExample.Criteria criteria = residentExample.createCriteria();
        criteria.andResidentNameEqualTo(resident.getResidentName());
        List<Resident> residents = residentMapper.selectByExample(residentExample);
        System.out.println(residents.get(0));
        if (residents.get(0).getResidentPwd().equals(resident.getResidentPwd())){
            residentExample.clear();
            return residents.get(0);
        }
        return null;
    }

    @Override
    public Resident modifyResident(Resident resident) {
        return resident;
    }


    @Override
    public List<Resident> findAllResidents() {
        System.out.println(2);
        List<Resident> allResidents = residentMapper.findAllResidents();
        return allResidents;
    }

    @Override
    public R importResident(MultipartFile multipartFile)  {

        try {
            FileInputStream multipartFileInputStream = (FileInputStream) multipartFile.getInputStream();
            XSSFWorkbook workbook = new XSSFWorkbook(multipartFileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            List<Resident> list = new ArrayList<>();
            List<Integer> err = new ArrayList<>();
            for (int rowIndex = 1;rowIndex <= sheet.getLastRowNum();rowIndex++){
                XSSFRow row = sheet.getRow(rowIndex);
                Resident resident = new Resident();
                if (row==null){
                    continue;
                }
                XSSFCell namecell = row.getCell(0);
                XSSFCell pwdcell = row.getCell(1);
                XSSFCell phonecell = row.getCell(2);
    //            XSSFCell statecell = row.getCell(3);
                phonecell.getNumericCellValue();
                phonecell.setCellType(CellType.STRING);
                pwdcell.setCellType(CellType.STRING);
                if (phonecell.getStringCellValue().length() != 11){
                    err.add(rowIndex+1);
                }
                resident.setResidentName(namecell.getStringCellValue());
                resident.setResidentPwd(pwdcell.getStringCellValue());
                resident.setResidentPhone(phonecell.getStringCellValue());
                resident.setResidentState(1);
                resident.setResidentCreated(new Date());
               list.add(resident);
            }
            workbook.close();
            multipartFileInputStream.close();
            try {
                if (list !=null){
                    if (err.size() != 0){
                        return R.error("操作失败，行数错误："+err.toString());
                    }else {
                        for(Resident resident : list){
                            residentMapper.insert(resident);
                        }
                        return R.success("操作成功添加人数："+list.size());
                    }
                }else {
                    return R.error("请添加用户数据");
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
