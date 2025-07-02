package com.xworkz.instgramapp.service;

import com.xworkz.instgramapp.dto.UserDto;

public interface UserService {
    boolean validateUser(UserDto dto);
}
