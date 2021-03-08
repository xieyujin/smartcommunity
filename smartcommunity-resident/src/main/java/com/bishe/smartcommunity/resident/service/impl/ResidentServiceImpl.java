package com.bishe.smartcommunity.resident.service.impl;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.resident.domain.ResidentExample;
import com.bishe.smartcommunity.resident.mapper.ResidentMapper;
import com.bishe.smartcommunity.resident.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public Integer importResident(List<Resident> list) {
        Integer count=0;
        Integer state=1;
        for(Resident resident : list){
            if (resident.getResidentState()==null) resident.setResidentState(state);
            if (resident.getResidentPwd()==null) resident.setResidentPwd("123456");
            residentMapper.insert(resident);
            count++;
        }
        return count;
    }

}
