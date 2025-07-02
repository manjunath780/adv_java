package com.xworkz.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormDto {
    private int id;
    private String givenName;
    private String gmail;
    private String phoneNo;
    private String age;
    private String address;
}
