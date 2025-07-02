package com.xworkz.facebookapp.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String newPassword;
    private String gender;
    private String date;
}
