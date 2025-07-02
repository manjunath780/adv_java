package com.xworkz.assessment.servlet;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.service.AllFormService;
import com.xworkz.assessment.service.impl.AllFormServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm")
public class GetFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AllFormService service = new AllFormServiceImpl();
        FormDto[] dtos= service.getAllForm();

        for(FormDto dto : dtos){
            System.out.println(dto);

        }
        String name = "manjunath Prasad";
        req.setAttribute("name",name);

        req.setAttribute("getAllForms",dtos);

        RequestDispatcher dispatcher = req.getRequestDispatcher("forms.jsp");
        dispatcher.forward(req,resp);


    }
}
