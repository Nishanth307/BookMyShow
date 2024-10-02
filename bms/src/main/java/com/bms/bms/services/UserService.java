package com.bms.bms.services;

import org.springframework.stereotype.Service;

import com.bms.bms.models.User;
import com.bms.bms.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
      private UserRepository userRepository;
      public User createUser(User user){
            System.out.println("Got request for in service "+user.getEmail()+" with password "+user.getPasswd());
            return userRepository.save(user);
            //return new User();
      }
      public User getUser(Long userId) {
            return userRepository.findById(userId).orElse(null);
      }
}
