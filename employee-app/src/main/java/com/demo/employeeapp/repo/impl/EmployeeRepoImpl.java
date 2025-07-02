package com.demo.employeeapp.repo.impl;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.repo.EmployeeRepo;

import java.sql.*;

public class EmployeeRepoImpl implements EmployeeRepo {
    @Override
    public boolean employeeSaved(EmployeeDto employeeDto) {
        boolean isEmployeeSaved = false;
        PreparedStatement statement = null;
        Connection conn = null;
        try {           //Class.forName( "com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password@321");
            statement = conn.prepareStatement("insert into emp_details (emp_name,salary) values(?,?)");

            statement.setString(1,employeeDto.getEmployeeName());
            statement.setString(2, employeeDto.getSalary());

            System.out.println(employeeDto.getEmployeeName());


            int noOfRowsAffected   =  statement.executeUpdate();
            if(noOfRowsAffected > 0)
                isEmployeeSaved = true;


            statement.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            try{if(statement != null && conn != null) {
                statement.close();
                conn.close();
            }
            }catch (SQLException ref){
                ref.printStackTrace();
            }
        }

        return isEmployeeSaved;
    }
//    @Override
//    public boolean updateCostomerDetails(int id, double salary) {
//        boolean isAccountSaved = false;
//        try {
//            // Class.forName( "com.mysql.cj.jdbc.Driver");
//            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","password@321");
//            PreparedStatement statement = conn.prepareStatement("update employee.emp_details set salary=? where id=?");
//
//            statement.setDouble(1,salary);
//            statement.setInt(2, id);
//
//
//            int noOfRowsAffected   =  statement.executeUpdate();
//            if(noOfRowsAffected > 0)
//                isAccountSaved = true;
//
//            statement.close();
//            conn.close();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//
//        return isAccountSaved;
//    }
//
//    @Override
//    public EmployeeDto fetchAccountDetails(int id) {
//        EmployeeDto dto = new EmployeeDto();
//        try{
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","password@321");
//            PreparedStatement pstmt = connection.prepareStatement("select * from emp_details where id=?");
//
//        pstmt.setInt(1,id);
//
//        ResultSet rs = pstmt.executeQuery();
//
//        while(rs.next()){
//            dto.setId(rs.getInt(1));
//            dto.setEmployeeName(rs.getString(2));
//            dto.setSalary(rs.getString(3));
//        }
//
//        pstmt.close();
//        connection.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(dto);
//        return dto;
//    }
}

