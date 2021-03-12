package com.bishe.smartcommunity.resident.service;

import com.bishe.smartcommunity.resident.domain.Resident;
import com.bishe.smartcommunity.smartcommunitycommon.utils.R;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ResidentService {
    Resident findResidentByName(String residentName);

    Resident loginResident(Resident resident);

    Resident modifyResident(Resident resident);
    

    List<Resident> findAllResidents();


    R importResident(MultipartFile multipartFile);
}
