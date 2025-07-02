package com.xworkz.facebookapp.facebookdto;

import com.xworkz.facebookapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FacebookDto {
    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private Gender gender;
    private String email;
    private String mobile;
    private String password;
    private String userName;


}