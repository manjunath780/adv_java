//package com.demo.employeeapp.repo.impl;
//
//import com.demo.employeeapp.dto.EmployeeDto;
//import com.demo.employeeapp.hibernateconfig.HibernateUtil;
//import com.demo.employeeapp.repo.AllEmployeeRepo;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class AllEmployeeRepoImpl implements AllEmployeeRepo {
//    @Override
//    public List fetchAllEmployee() {
//        Transaction transaction = null;
//        List<EmployeeDto> employeeList = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//
//            transaction = session.beginTransaction();
//
//            employeeList = session.createQuery("from EmployeeDto").getResultList();
//
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//        return employeeList;
//    }
//}
////        List employeeDtos;
////        try {
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password@321");
////            PreparedStatement statement = conn.prepareStatement("select * from emp_details");
////
////            ResultSet rs = statement.executeQuery();
////            employeeDtos = new ArrayList<>();
////            while (rs.next()) {
////                EmployeeDto dto = new EmployeeDto();
////                dto.setId(rs.getInt(1));
////                dto.setEmployeeName(rs.getString(2));
////                dto.setSalary(rs.getString(3));
////                employeeDtos.add(dto);
////            }
////
////            statement.close();
////            conn.close();
////        } catch (SQLException | ClassNotFoundException e) {
////            throw new RuntimeException(e);
////        }
////        return employeeDtos;
////    }
////}
//
