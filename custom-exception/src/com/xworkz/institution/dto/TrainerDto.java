package com.xworkz.institution.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerDto {
    private int id;
    private String name;
    private int age;
    private String address;
}
