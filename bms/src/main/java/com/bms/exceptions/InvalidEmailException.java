package com.bms.exceptions;

public class InvalidEmailException extends RuntimeException{
      public InvalidEmailException(){
            super("Invalid email");
      }
}
