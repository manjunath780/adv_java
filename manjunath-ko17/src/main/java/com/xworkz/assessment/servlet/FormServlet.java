package com.xworkz.assessment.servlet;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.service.FormService;
import com.xworkz.assessment.service.impl.FormServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/submit")
public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String givenName = req.getParameter("givenName");
        String gmail = req.getParameter("gmail");
        String phoneNo = req.getParameter("phoneNo");
        String age = req.getParameter("age");
        String address = req.getParameter("address");


        FormDto dto = new FormDto();
        dto.setGivenName(givenName);
        dto.setGmail(gmail);
        dto.setPhoneNo(phoneNo);
        dto.setAddress(address);
        dto.setAge(age);

        FormService service = new FormServiceImpl();
        service.validateForm(dto);

    }
}
