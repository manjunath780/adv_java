package com.xworkz.netflixapp.service;

import com.xworkz.netflixapp.dto.UserDto;

public interface NetflixService {
    boolean userValidation(UserDto dto);
}
