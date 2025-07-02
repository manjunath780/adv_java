package com.xworkz.instgramapp.servlet;

import com.xworkz.instgramapp.dto.UserDto;
import com.xworkz.instgramapp.service.UserService;
import com.xworkz.instgramapp.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signup")
public class InstagramServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        Strin phoneNumber = req.getParameter("phoneNumber");
        String fullName = req.getParameter("fullName");
        String birthday = req.getParameter("birthday");
        String gender = req.getParameter("gender");

        UserDto dto = new UserDto();
        dto.setUserName(username);
        dto.setBirthday(birthday);
        dto.setFullName(fullName);
        dto.setGender(gender);
        dto.setPassword(password);
        dto.setPhoneNumber(phoneNumber);
        dto.setEmail(email);

        UserService service = new UserServiceImpl();
        service.validateUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("your Instagram account is successfully created " +
                " user Name "+username);

    }
}
