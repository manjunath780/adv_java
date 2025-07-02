package com.xworkz.amazonapp.servlet;

//import com.xworkz.amazonapp.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class UserRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String email =  req.getParameter("email");
        String passWord = req.getParameter("password");

//
//        UserDto dto = new UserDto();
//        dto.setEmail(email);
//        dto.setPassWord(passWord);


        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you "+email+ "for Registering");
    }
}
