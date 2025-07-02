package com.xworkz.netflixapp.repo.impl;

import com.xworkz.netflixapp.dto.UserDto;
import com.xworkz.netflixapp.repo.NetflixRepo;

import java.sql.*;

public class NetflixRepoImpl implements NetflixRepo {
    @Override
    public boolean saveUser(UserDto dto) {

        boolean userSaved =false;
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("","","");
            PreparedStatement statement = connection.prepareStatement("");
            statement.setString(1, dto.getUserName());
            statement.setString(2, dto.getGmail());
            statement.setString(3, dto.getDob());

            int rows = statement.executeUpdate();
            if(rows > 0){
                userSaved = true;
            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userSaved;
    }

}
