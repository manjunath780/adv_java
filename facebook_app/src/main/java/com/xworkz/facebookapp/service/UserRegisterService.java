package com.xworkz.facebookapp.service;

import com.xworkz.facebookapp.dto.UserRegisterDto;

public interface UserRegisterService {

    boolean vadidateAndSaveUser(UserRegisterDto dto);

}
