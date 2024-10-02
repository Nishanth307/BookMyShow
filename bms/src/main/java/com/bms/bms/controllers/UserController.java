package com.bms.bms.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.bms.bms.dtos.CreateUserRequest;
import com.bms.bms.dtos.GetUserResponse;
import com.bms.bms.models.User;
import com.bms.bms.services.UserService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController //@Controller or @Component -> Aliases for (MVC)-> IOC or automatic dependency injection by spring
//@RequestMapping("/api/v1") ideal for one class and creates path ambiguities when mentioned for multiple classes
//server.servlet.context-path=/api/v1 in application properties
@AllArgsConstructor
public class UserController {
      private UserService userService;
      //@RequestMapping("/user", method=RequestMethod.POST) 
      @PostMapping("/user")
      public GetUserResponse createUser(@RequestBody CreateUserRequest request){  //@RequestBody for requesting body in api
            System.out.println("From controller "+request.getEmail());
            User user = userService.createUser(request.toUser());
            return GetUserResponse.fromUser(user);
      }
}
