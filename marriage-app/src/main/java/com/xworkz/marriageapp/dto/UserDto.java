package com.xworkz.marriageapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userId ;
    private String givenName;
    private String surName;
    private String emailId;
    private String password;
    private String confirmPassword;
}
