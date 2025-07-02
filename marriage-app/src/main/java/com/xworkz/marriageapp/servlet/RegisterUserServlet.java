package com.xworkz.marriageapp.servlet;


import com.xworkz.marriageapp.dto.UserDto;
import com.xworkz.marriageapp.service.RegisterUserService;
import com.xworkz.marriageapp.service.impl.RegisterUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String   userId  =    req.getParameter("userId");
        String   givenName =    req.getParameter("givenName");
        String surName                 =      req.getParameter("surName");
        String emailId                  =       req.getParameter("emailId");
        String password                 =      req.getParameter("password");
        String confirmPassword          =       req.getParameter("confirmPassword");

        UserDto dto = new UserDto();
        dto.setUserId(userId);
        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setEmailId(emailId);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);

        System.out.println(dto);

        RegisterUserService  registerUserService  = new RegisterUserServiceImpl();
        boolean isDataValidated =     registerUserService.validateAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter() ;
        printWriter.write("Thank you "+ givenName+ " for Registering");
        System.out.println(givenName);
    }

}
