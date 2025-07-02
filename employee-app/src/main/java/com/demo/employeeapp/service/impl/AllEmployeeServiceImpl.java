package com.demo.employeeapp.service.impl;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.repo.AllEmployeeRepo;
import com.demo.employeeapp.repo.impl.AllEmployeeRepoImpl;
import com.demo.employeeapp.service.AllEmployeeSerivce;

public class AllEmployeeServiceImpl implements AllEmployeeSerivce {

    AllEmployeeRepo empDto;
    public AllEmployeeServiceImpl(){empDto = new  AllEmployeeRepoImpl();}
    @Override
    public EmployeeDto[] getAllemployee() {return empDto.fetchAllEmployee();}
}
