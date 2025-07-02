package com.xworkz.assessment.repo.impl;

import com.xworkz.assessment.dto.FormDto;
import com.xworkz.assessment.repo.FormRepo;
import com.xworkz.assessment.service.FormService;
import com.xworkz.assessment.service.impl.FormServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormRepoImpl implements FormRepo {
    @Override
    public boolean saveForm(FormDto dto) {
        boolean savedForm = false;

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "password@321");
            PreparedStatement statement = conn.prepareStatement("insert into form.user_table (givenName,gmail,phoneNo,age,address) values(?,?,?,?,?)");

            statement.setString(1,dto.getGivenName());
            statement.setString(2,dto.getGmail());
            statement.setString(3,dto.getPhoneNo());
            statement.setString(4,dto.getAge());
            statement.setString(5,dto.getAddress());

            int noOfRowsAffected   =  statement.executeUpdate();
            if(noOfRowsAffected > 0)
                savedForm = true;

            statement.close();
            conn.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return savedForm;
    }
}
