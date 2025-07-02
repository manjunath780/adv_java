package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.service.HospitalService;
import com.xworkz.hospitalapp.service.imp.HospitalServiceImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        PatientDto dto = new PatientDto();
        dto.setId(101L);
        dto.setFirstName("brocode");
        dto.setLastName("bob");
        dto.setGender("Male");
        dto.setDateOfBirth("2000-05-15");
        dto.setPhone("9876543210");
        dto.setEmail("bob12@gmail.com");
        dto.setAddress("123, Main Street, Bangalore");


        HospitalService service = new HospitalServiceImpl();
        service.validatePatient(dto);
    }
}
