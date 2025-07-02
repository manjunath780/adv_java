package com.xworkz.marketapp;

import com.xworkz.marketapp.dto.CostomerDto;
import com.xworkz.marketapp.service.MarketService;
import com.xworkz.marketapp.service.impl.MarketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class MarketShoppingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

         String fullName = req.getParameter("fullName");
         String email  = req.getParameter("email");
         String phoneNumber = req.getParameter("phoneNumber");
        String gender = req.getParameter("gender");
         String dateOfBirth = req.getParameter("dateOfBirth");
         String address = req.getParameter("address");
         String city = req.getParameter("city");
         String state = req.getParameter("state");
         String pincode = req.getParameter("pincode");


        CostomerDto dto  =  new CostomerDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setCity(city);
        dto.setGender(gender);
        dto.setAddress(address);
        dto.setState(state);
        dto.setPincode(pincode);
        dto.setDateOfBirth(dateOfBirth);
        dto.setPhoneNumber(phoneNumber);

        PrintWriter printwriter = resp.getWriter();
        printwriter.write("your SUPER-MARKET account is succesfully created "+fullName);

       MarketService marketService = new MarketServiceImpl();
       marketService.validateCostomer(dto);

    }


}
