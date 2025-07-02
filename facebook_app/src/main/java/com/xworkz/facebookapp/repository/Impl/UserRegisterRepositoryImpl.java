package com.xworkz.facebookapp.repository.Impl;

import com.xworkz.facebookapp.dto.UserRegisterDto;
import com.xworkz.facebookapp.repository.UserRegisterRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegisterRepositoryImpl implements UserRegisterRepository {
    @Override
    public boolean saveUser(UserRegisterDto dto) {
        boolean userRegistered = false;

        try {
             Class.forName( "com.mysql.cj.jdbc.Driver");
             //jdbc interface coonection
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/user_accounts","root","password@321");
            //driver implimentation
            Statement statement = conn.createStatement();
            int noOfRowsAffected   =  statement.executeUpdate("insert into customers (userId,first_name,last_name, email_id,password,date,gender) values("+
                    "'"+dto.getUserId()+"'," +
                    "'"+dto.getFirstName()+"'," +
                    "'"+dto.getLastName()+"'," +
                    "'"+dto.getEmail()+"'," +
                    "'"+dto.getNewPassword()+"'," +
                    "'"+dto.getDate()+"'," +
                    "'"+dto.getGender()+"')");
            if(noOfRowsAffected > 0)
                userRegistered = true;
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return userRegistered;
    }
}
