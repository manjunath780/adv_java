package com.demo.employeeapp.repo;

import com.demo.employeeapp.dto.EmployeeDto;

public interface AllEmployeeRepo {
    EmployeeDto[] fetchAllEmployee();
}
