package com.xworkz.hospitalapp.repo;

import com.xworkz.hospitalapp.dto.PatientDto;

public interface HospitalRepo {
    boolean savedPatient(PatientDto  dto);
}
