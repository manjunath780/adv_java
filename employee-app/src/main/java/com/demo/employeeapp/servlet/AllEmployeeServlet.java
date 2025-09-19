package com.demo.employeeapp.servlet;


import com.demo.employeeapp.service.EmployeeService;
import com.demo.employeeapp.service.impl.EmpServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userDetails")
public class AllEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeService  service= new EmpServiceImpl();
        List allEmpDto = service.getAllemployee();


       // String userName = "brocode";
        //req.setAttribute("uName",userName);

        //setting data into the req scope
        req.setAttribute("listOfEmployees",allEmpDto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("userDetails.jsp");

        dispatcher.forward(req,resp);

    }
}
