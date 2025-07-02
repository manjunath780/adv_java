package com.xworkz.instgramapp.service.impl;

import com.xworkz.instgramapp.dto.UserDto;
import com.xworkz.instgramapp.repo.UserRepo;
import com.xworkz.instgramapp.repo.impl.UserRepoImpl;
import com.xworkz.instgramapp.service.UserService;

public class UserServiceImpl implements UserService {
    UserRepo repo;
    public UserServiceImpl(){repo = new UserRepoImpl();}
    @Override
    public boolean validateUser(UserDto dto) {return repo.saveUser(dto);}
}
