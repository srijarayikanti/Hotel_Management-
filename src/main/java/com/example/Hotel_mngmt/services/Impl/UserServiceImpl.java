package com.example.Hotel_mngmt.services.Impl;

import com.example.Hotel_mngmt.Repositories.UserRepository;
import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestUser;
import com.example.Hotel_mngmt.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public ResponseEntity<User> saveUser(RequestUser request){
        User user1=new User();
        user1.setUserName(request.getUserName());
        user1.setPassword(request.getPassword());
        user1.setRole(request.getRole());
        return ResponseEntity.ok(userRepository.save(user1));
    }
    @Override
    public ResponseEntity<User> FetchUserByName(String userName){
        Optional<User> user= userRepository.findByuserName(userName);
        if (user.isEmpty()){
            throw new RuntimeException("user not found by userName");
        }
        return ResponseEntity.ok(user.get());
    }


}

