package com.bms.bms.dtos;

import com.bms.bms.models.User;

import lombok.Builder;
import lombok.Data;

@Data //@Data has getters,setters,no args ctor
@Builder
public class CreateUserRequest {
      private String name;
      private String email;
      private String passwd;

      public User toUser(){
            return new User(name,email,passwd);
      }
}
