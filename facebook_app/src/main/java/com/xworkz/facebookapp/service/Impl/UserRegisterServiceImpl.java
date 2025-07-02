package com.xworkz.facebookapp.service.Impl;

import com.xworkz.facebookapp.dto.UserRegisterDto;
import com.xworkz.facebookapp.repository.Impl.UserRegisterRepositoryImpl;
import com.xworkz.facebookapp.repository.UserRegisterRepository;
import com.xworkz.facebookapp.service.UserRegisterService;

public class  UserRegisterServiceImpl  implements UserRegisterService {

    UserRegisterRepository userRegisterRepository;

    public UserRegisterServiceImpl() {
        userRegisterRepository = new UserRegisterRepositoryImpl();
    }

    @Override
    public boolean vadidateAndSaveUser(UserRegisterDto dto) {

        boolean UserSaved = false;

        boolean isUserNameValid = false;
        boolean isUserEmailValid = false;
        boolean isUserPasswordValid = false;

        if(dto.getFirstName() != null && !dto.getFirstName().isEmpty()){
            isUserNameValid = true;
        }
        if(dto.getNewPassword() != null && !dto.getNewPassword().isEmpty()){
            isUserPasswordValid = true;
        }
        if(dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isUserEmailValid = true;
        }

        if(isUserEmailValid && isUserNameValid && isUserPasswordValid){
            UserSaved =userRegisterRepository.saveUser(dto);
        }

        return UserSaved;
    }
}
