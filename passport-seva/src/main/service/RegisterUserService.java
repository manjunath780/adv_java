package com.passport.passportapp.service;

import com.passport.passportapp.dto.UserDto;

public interface RegisterUserService {

    boolean validateAndSaveUser(UserDto dto);
}