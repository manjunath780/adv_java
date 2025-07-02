package com.xworkz.assessment.repo.impl;

import com.xworkz.assessment.dto.FormDto;

import java.sql.*;

public class AllFormRepoImpl implements com.xworkz.assessment.repo.AllFormRepo {
    @Override
    public  FormDto[]  fetchAllForm() {
        int count = 0;
        FormDto[] formDtos;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "password@321");
            PreparedStatement statement = conn.prepareStatement("select * from form.user_table");
            ResultSet rs = statement.executeQuery();



            while (rs.next()) {
                count++;
            }

            rs = statement.executeQuery();
            formDtos = new FormDto[count];
            int index = 0;
            while (rs.next()) {
                FormDto dto = new FormDto();
                dto.setId(rs.getInt(1));
                dto.setGivenName(rs.getString(2));
                dto.setGmail(rs.getString(3));
                dto.setPhoneNo(rs.getString(4));
                dto.setAge(rs.getString(5));
                dto.setAddress(rs.getString(6));
                formDtos[index++]=dto;
            }

            statement.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  formDtos;
    }
}
