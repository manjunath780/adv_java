package com.passport.passportapp.repository.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.RegisterUserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUserRepositoryImpl implements RegisterUserRepository {
    @Override
    public boolean saveUser(UserDto dto) {
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/passport", "root", "root");
            Statement statement = conn.createStatement();
            int noOfRowsAffected =
                    statement.executeUpdate("insert into user_table values(" + dto.getUserId() + "," +
                            "'" + dto.getGivenName() + "'," +
                            "'" + dto.getSurName() + "'," +
                            "'" + dto.getEmailId() + "'," +
                            "'" + dto.getPassword() + "'," +
                            "'" + dto.getConfirmPassword() + "')");

            if (noOfRowsAffected > 0)
                userRegistered = true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        System.out.println(dto);

        return userRegistered;
    }
}