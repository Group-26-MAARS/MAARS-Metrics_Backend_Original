package com.maarsCloud.service;

import com.maarsCloud.model.ProcGen;
import com.maarsCloud.model.ProcGenDto;
import com.maarsCloud.model.User;      
import com.maarsCloud.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    
    //public void addUser(UserDto user);
    
    List<User> findAll();

    void delete(int id); //

    User findOne(String username);
    
    User findById(int id);

    UserDto update(UserDto userDto);
    
    List<?> findAllDates();
    
    List<?> findRecent();

    List<?> findActive();
}
