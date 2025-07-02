package com.xworkz.facebookapp.servlet;

import com.xworkz.facebookapp.dto.UserRegisterDto;
import com.xworkz.facebookapp.service.Impl.UserRegisterServiceImpl;
import com.xworkz.facebookapp.service.UserRegisterService;

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
        String userId = req.getParameter("userId");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String newPassword = req.getParameter("newPassword");
        String date = req.getParameter("date");
        String gender = req.getParameter("gender");

        UserRegisterDto userDto = new UserRegisterDto();
        userDto.setUserId(userId);
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setEmail(email);
        userDto.setNewPassword(newPassword);
        userDto.setDate(date);
        userDto.setGender(gender);


        UserRegisterService userRegisterService = new UserRegisterServiceImpl();
        userRegisterService.vadidateAndSaveUser(userDto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("succeccccccfully login "+firstName );
    }
}
