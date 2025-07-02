package com.xworkz.netflixapp.repo;

import com.xworkz.netflixapp.dto.UserDto;

public interface NetflixRepo {
    boolean saveUser(UserDto dto);
}
