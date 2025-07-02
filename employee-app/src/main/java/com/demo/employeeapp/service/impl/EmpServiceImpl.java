package com.demo.employeeapp.service.impl;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.repo.EmployeeRepo;
import com.demo.employeeapp.repo.impl.EmployeeRepoImpl;
import com.demo.employeeapp.service.EmployeeService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpServiceImpl implements EmployeeService {

EmployeeRepo employeeRepo = new EmployeeRepoImpl();
    @Override
    public boolean validateEmployee(EmployeeDto employeeDto) {
        boolean userValid = false;
        boolean isValidEmployeeName =false;

        if(employeeDto.getEmployeeName() != null && !employeeDto.getEmployeeName().isEmpty() ){
            isValidEmployeeName = true;
        }

        if (isValidEmployeeName){
            userValid = employeeRepo.employeeSaved(employeeDto);
        }
        return userValid;
    }
//    @Override
//    public boolean updateAccountTypeById(int id,double salary) {
//        boolean accountTypeUpdated = false;
//
//        if(id>0 && salary != 0.0 && id==3){
//            double salary1 = salary + 10000.0;
//            accountTypeUpdated = employeeRepo. updateCostomerDetails( id, salary1);
//        }
//
//        return accountTypeUpdated;
//    }
//
//    @Override
//    public EmployeeDto fetchAccountById(int id) {
//        EmployeeDto employeeDto = new EmployeeDto();
//
//
//
//        return  employeeRepo.fetchAccountDetails(id);
//    }
}
