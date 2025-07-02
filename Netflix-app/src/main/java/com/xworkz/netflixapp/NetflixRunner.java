package com.xworkz.netflixapp;

import com.xworkz.netflixapp.dto.UserDto;
import com.xworkz.netflixapp.service.NetflixService;
import com.xworkz.netflixapp.service.impl.NetflixServiceImpl;


public class NetflixRunner {
    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setUserName("manjunath");
        userDto.setDob("11/04/2002");
        userDto.setGmail("prasad@123gmail.com");

        NetflixService service =new NetflixServiceImpl();
       service.userValidation(userDto);

    }
}
