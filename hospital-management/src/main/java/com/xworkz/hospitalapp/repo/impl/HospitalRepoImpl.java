package com.xworkz.hospitalapp.repo.impl;

import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.repo.HospitalRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRepoImpl implements HospitalRepo {
    @Override
    public boolean savedPatient(PatientDto dto) {
        boolean patientSaved = false;
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db","root","password@321");
            Statement statement = conn.createStatement();
            int noOfRowsAffected   =  statement.executeUpdate( "INSERT INTO patient_table (id, firstName, lastName, gender, dateOfBirth, phone, email, address) " +
                    "VALUES (" +
                    "'" + dto.getId() + "'," +
                    "'" + dto.getFirstName() + "'," +
                    "'" + dto.getLastName() + "'," +
                    "'" + dto.getGender() + "'," +
                    "'" + dto.getDateOfBirth() + "'," +
                    "'" + dto.getPhone() + "'," +
                    "'" + dto.getEmail() + "'," +
                    "'" + dto.getAddress() + "')");
            if(noOfRowsAffected > 0)
                patientSaved = true;

            statement.close();
            conn.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return patientSaved;
    }

}
