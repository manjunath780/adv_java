package com.demo.employeeapp.repo.impl;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.hibernateconfig.HibernateUtil;
import com.demo.employeeapp.repo.EmployeeRepo;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo {
    @Override
    public boolean employeeSaved(EmployeeDto employeeDto) {
        Transaction transaction = null;
        //List<EmployeeDto> employeeList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(employeeDto);
            //  employeeList = session.createQuery("from EmployeeDto").getResultList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return true;
        //return  employeeList;
    }
    @Override
    public List fetchAllEmployee() {
        Transaction transaction = null;
        List<EmployeeDto> employeeList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            employeeList = session.createQuery("from EmployeeDto").getResultList();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return employeeList;
    }
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
//}

