package com.bishe.smartcommunity.resident.service;

import com.bishe.smartcommunity.resident.domain.Resident;

import java.util.List;

public interface ResidentService {
    Resident findResidentByName(String residentName);

    Resident loginResident(Resident resident);

    Resident modifyResident(Resident resident);

    Integer importResident(List<Resident> list);
}
