package com.demo.employeeapp.repo.impl;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.repo.AllEmployeeRepo;

import java.sql.*;

public class AllEmployeeRepoImpl implements AllEmployeeRepo {
    @Override
    public EmployeeDto[] fetchAllEmployee() {

        EmployeeDto[] employeeDtos;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password@321");
            PreparedStatement statement = conn.prepareStatement("select * from emp_details");

            ResultSet rs = statement.executeQuery();

            int count = 0;
            while (rs.next()) {
                count++;
            }

            employeeDtos = new EmployeeDto[count];
            int index = 0;
            rs = statement.executeQuery();
            while (rs.next()) {
                EmployeeDto dto = new EmployeeDto();
                dto.setId(rs.getInt(1));
                dto.setEmployeeName(rs.getString(2));
                dto.setSalary(rs.getString(3));
                employeeDtos[index++] = dto;
               // index++;
            }

            statement.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employeeDtos;
    }}

