package com.xworkz.netflixapp.service.impl;

import com.xworkz.netflixapp.dto.UserDto;
import com.xworkz.netflixapp.repo.NetflixRepo;
import com.xworkz.netflixapp.repo.impl.NetflixRepoImpl;
import com.xworkz.netflixapp.service.NetflixService;

public class NetflixServiceImpl implements NetflixService {
    NetflixRepo repo = new NetflixRepoImpl();

    @Override
    public boolean userValidation(UserDto dto) {
        boolean userSaved = false;
        boolean isUserValid = false;
        boolean isGmailValid = false;

        if(dto.getUserName() != null && !dto.getUserName().isEmpty()){
            isUserValid = true;
        }
        if(dto.getGmail() != null && !dto.getGmail().isEmpty()){
            isGmailValid = true;
        }
        if(isUserValid && isGmailValid){
            userSaved = repo.saveUser(dto);
        }
        return userSaved;
    }
}
