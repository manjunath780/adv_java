package com.xworkz.assessment.servlet;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.service.AllFormService;
import com.xworkz.assessment.service.impl.AllFormServiceImpl;

public class Runner {
    public static void main(String[] args) {
        AllFormService service = new AllFormServiceImpl();
        FormDto[] dtos= service.getAllForm();

        for(FormDto dto : dtos){
            System.out.println(dto);
        }
    }
}
