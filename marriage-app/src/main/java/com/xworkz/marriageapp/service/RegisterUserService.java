package com.xworkz.marriageapp.service;


import com.xworkz.marriageapp.dto.UserDto;

public interface RegisterUserService {

    boolean validateAndSaveUser(UserDto dto);
}