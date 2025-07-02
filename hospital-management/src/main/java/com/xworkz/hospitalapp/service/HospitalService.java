package com.xworkz.hospitalapp.service;

import com.xworkz.hospitalapp.dto.PatientDto;

public interface HospitalService {
    boolean validatePatient(PatientDto dto);
}
