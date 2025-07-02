package com.xworkz.instgramapp.repo;

import com.xworkz.instgramapp.dto.UserDto;

public interface UserRepo {
    boolean saveUser(UserDto dto);
}
