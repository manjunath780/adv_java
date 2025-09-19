package com.demo.employeeapp.service;

import com.demo.employeeapp.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    boolean validateEmployee(EmployeeDto employeeDto);
    List getAllemployee ();

   // boolean validateEmployee(EmployeeDto employeeDto);
//    boolean updateAccountTypeById(int id, double salary);
//    EmployeeDto fetchAccountById(int id);
}
