package com.xworkz.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
    public static void main(String[] args)  throws ClassNotFoundException {

            Class.forName("com.mysql.cj.jdbc.Driver");



        try {
            Connection conn = DriverManager.getConnection("","","");
        } catch (SQLException e) {

            FileReader file = null;
            try {
                file = new FileReader("dependency.txt");
                BufferedReader fileInput = new BufferedReader(file);
                System.out.println(fileInput.readLine());
                fileInput.close();
            } catch ( IOException ex) {

            }


        }


    }
}
