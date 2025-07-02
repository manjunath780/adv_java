package com.xworkz.marriageapp.repository.impl;

import com.xworkz.marriageapp.dto.UserDto;
import com.xworkz.marriageapp.repository.RegisterUserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUserRepositoryImpl implements RegisterUserRepository {


    @Override
    public boolean saveUser(UserDto dto) {
        boolean userRegistered = false;
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkartaccounts","root","password@321");
            Statement statement = conn.createStatement();
            int noOfRowsAffected   =  statement.executeUpdate("insert into user_table (given_name,sur_name, email_id,password,confirm_password) values("+
                    "'"+dto.getGivenName()+"'," +
                    "'"+dto.getSurName()+"'," +
                    "'"+dto.getEmailId()+"'," +
                    "'"+dto.getPassword()+"'," +
                    "'"+dto.getConfirmPassword()+"')");
            if(noOfRowsAffected > 0)
                userRegistered = true;
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return userRegistered;
    }
}
