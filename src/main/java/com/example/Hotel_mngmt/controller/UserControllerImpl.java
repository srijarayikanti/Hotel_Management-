package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestUser;
import com.example.Hotel_mngmt.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserControllerImpl implements UserController{

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }
    @Override
    public ResponseEntity<User> saveUser(RequestUser request){
        return userService.saveUser(request);
    }
    @Override
    public ResponseEntity<User> FetchUserByName(String userName){
        return userService.FetchUserByName(userName);
    }

}
