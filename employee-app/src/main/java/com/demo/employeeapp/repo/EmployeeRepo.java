package com.demo.employeeapp.repo;

import com.demo.employeeapp.dto.EmployeeDto;

public interface EmployeeRepo {
    boolean employeeSaved(EmployeeDto employeeDto);
//    boolean updateCostomerDetails(int id,double salary);
//    EmployeeDto fetchAccountDetails(int id);
}
