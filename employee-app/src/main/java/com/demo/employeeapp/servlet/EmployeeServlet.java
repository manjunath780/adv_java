package com.demo.employeeapp.servlet;

import com.demo.employeeapp.dto.EmployeeDto;
import com.demo.employeeapp.service.EmployeeService;
import com.demo.employeeapp.service.impl.EmpServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class EmployeeServlet extends HttpServlet {


    EmployeeService service;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeName = req.getParameter("employeeName");
        String salary = req.getParameter("salary");

        System.out.println(employeeName);

        EmployeeDto dto = new EmployeeDto();
        dto.setEmployeeName(employeeName);
        dto.setSalary(salary);

        service = new EmpServiceImpl();
        service.validateEmployee(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Added salary "+salary+ "  to "+employeeName +" successfully");

    }
}
