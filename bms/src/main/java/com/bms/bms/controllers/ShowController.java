package com.bms.bms.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms.dtos.CreateShowRequest;
import com.bms.bms.models.Show;
import com.bms.bms.services.ShowService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
public class ShowController {
      private ShowService showService;

      @GetMapping("/show/{id}")
      public Show readShow(@PathVariable Long id){
            return showService.getShow(id);
      }
      
      @PostMapping("/show")
      public Show createShow(@RequestBody CreateShowRequest request){
             return showService.createShow(request); 
       }
       
}
