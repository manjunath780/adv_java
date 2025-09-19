package com.demo.employeeapp.repo;

import com.demo.employeeapp.dto.EmployeeDto;

import java.util.List;

public interface EmployeeRepo {
    boolean employeeSaved(EmployeeDto employeeDto);
    public List fetchAllEmployee();
//    boolean updateCostomerDetails(int id,double salary);
//    EmployeeDto fetchAccountDetails(int id);
}
