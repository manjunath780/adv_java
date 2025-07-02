package com.passport.passportapp.servlet;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.service.RegisterUserService;
import com.passport.passportapp.service.impl.RegisterUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/registerUser")
public class RegisterUserServlet extends HttpServlet {

    RegisterUserService registerUserService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String   givenName =    req.getParameter("givenName");
        String surName                 =      req.getParameter("surName");
        String emailId                  =       req.getParameter("emailId");
        String password                 =      req.getParameter("password");
        String confirmPassword          =       req.getParameter("confirmPassword");

        UserDto dto = new UserDto();
        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setEmailId(emailId);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);

        System.out.println(dto);

        registerUserService  = new RegisterUserServiceImpl();
        boolean isDataValidated =     registerUserService.validateAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter() ;
        printWriter.write("Thank you "+ givenName+ " for Registering");
    }
}