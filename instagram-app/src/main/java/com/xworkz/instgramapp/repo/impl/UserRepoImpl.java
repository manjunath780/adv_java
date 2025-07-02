package com.xworkz.instgramapp.repo.impl;

import com.xworkz.instgramapp.dto.UserDto;
import com.xworkz.instgramapp.repo.UserRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepoImpl implements UserRepo {
    @Override
    public boolean saveUser(UserDto dto) {
        boolean isEmployeeSaved = false;
        try {
            //Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/instagramdb", "root", "password@321");
            PreparedStatement statement = conn.prepareStatement("INSERT INTO users (username,password,email,phone_number,full_name,birthday,gender) VALUES(?,?,?,?,?,?,?)");

            statement.setString(1,dto.getUserName());
            statement.setString(2, dto.getPassword());
            statement.setString(3,dto.getEmail());
            statement.setString(4, dto.getPhoneNumber());
            statement.setString(5,dto.getFullName());
            statement.setString(6, dto.getBirthday());
            statement.setString(7, dto.getGender());


            int noOfRowsAffected   =  statement.executeUpdate();
            if(noOfRowsAffected > 0)
                isEmployeeSaved = true;


            statement.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

        return isEmployeeSaved;

    }
}
