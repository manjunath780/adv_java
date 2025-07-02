package com.xworkz.instgramapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private String fullName;
    private String birthday;
    private String gender;

}
