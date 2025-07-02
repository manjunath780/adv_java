package com.xworkz.netflixapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int userId;
    private String UserName;
    private String gmail;
    private String dob;
}
