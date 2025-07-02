package com.xworkz.hospitalapp.service.imp;

import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.repo.HospitalRepo;
import com.xworkz.hospitalapp.repo.impl.HospitalRepoImpl;
import com.xworkz.hospitalapp.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {

    HospitalRepo repo = new HospitalRepoImpl();


    @Override
    public boolean validatePatient(PatientDto dto) {
       // boolean isValidated = false;


        return repo.savedPatient(dto);
    }
}