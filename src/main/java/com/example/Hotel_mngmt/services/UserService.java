package com.example.Hotel_mngmt.services;

import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestUser;
import org.springframework.http.ResponseEntity;

public interface UserService {

   // ResponseEntity<User> saveUser(User user);

    ResponseEntity<User> saveUser(RequestUser request);

    ResponseEntity<User> FetchUserByName(String userName);
}
