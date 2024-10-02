package com.bms.bms.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class User extends BaseModel{
      private String name;
      private String email;
      private String passwd;

      public User(String name,String email,String passwd){
            this.name = name;
            this.email = email;
            this.passwd = passwd;
      }
}
