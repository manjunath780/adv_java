package com.xworkz.marketapp.repo.Impl;

import com.xworkz.marketapp.dto.CostomerDto;
import com.xworkz.marketapp.repo.MarketRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MarketRepoImpl implements MarketRepo {

    @Override
    public boolean saveCostomer(CostomerDto costomerDto) {

        boolean isCustomerSaved = false;

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/supermarket","root","password@321");

            PreparedStatement statement = conn.prepareStatement("insert into costomer_details (full_name, email, phone_number, gender, date_of_birth, address, city, state, pincode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            statement.setString(1, costomerDto.getFullName());
            statement.setString(2, costomerDto.getEmail());
            statement.setString(3, costomerDto.getPhoneNumber());
            statement.setString(4, costomerDto.getGender());
            statement.setString(5, costomerDto.getDateOfBirth());
            statement.setString(6, costomerDto.getAddress());
            statement.setString(7, costomerDto.getCity());
            statement.setString(8, costomerDto.getState());
            statement.setString(9, costomerDto.getPincode());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                isCustomerSaved = true;
            }

            statement.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return isCustomerSaved;


    }
}
