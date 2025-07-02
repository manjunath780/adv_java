package com.xworkz.facebookapp.repository;

import com.xworkz.facebookapp.dto.UserRegisterDto;

public interface UserRegisterRepository {
    boolean saveUser(UserRegisterDto dto);
}
