package com.xworkz.marriageapp.service.impl;


import com.xworkz.marriageapp.dto.UserDto;
import com.xworkz.marriageapp.repository.RegisterUserRepository;
import com.xworkz.marriageapp.repository.impl.RegisterUserRepositoryImpl;
import com.xworkz.marriageapp.service.RegisterUserService;

public class RegisterUserServiceImpl implements RegisterUserService {

    RegisterUserRepository registerUserRepository;

    public RegisterUserServiceImpl(){
        registerUserRepository  = new RegisterUserRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveUser(UserDto dto) {
        boolean userSaved = false;

        boolean isGivenNameValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPassword = false;

        if(dto.getGivenName()!= null && !dto.getGivenName().isEmpty()){
            isGivenNameValid = true;
        }
        if(dto.getPassword() != null && !dto.getPassword().isEmpty()){
            isPasswordValid = true;
        }
        if(dto.getConfirmPassword()!= null && !dto.getConfirmPassword().isEmpty() && dto.getConfirmPassword().equals(dto.getPassword())){
            isConfirmPassword = true;
        }

        if(isGivenNameValid  && isPasswordValid && isConfirmPassword) {
            // set user Id dynamically      dto.setUserId(// );
            userSaved = registerUserRepository.saveUser(dto);
        }

        return userSaved;
    }
}