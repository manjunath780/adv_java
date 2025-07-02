package com.xworkz.marketapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostomerDto {
   private int costomerId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String pincode;
    //private boolean isPremiumMember;
}
