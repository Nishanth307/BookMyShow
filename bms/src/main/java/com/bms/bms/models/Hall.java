package com.bms.bms.models;

import java.util.ArrayList;
import java.util.List;

import com.bms.bms.models.enums.MovieFeature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hall extends BaseModel{
      /*
       * 
       @ManyToOne
       @JoinColumn(name="theater_id")
       */
      private String name;

      @OneToMany
      private List<Seat> seats = new ArrayList<>();
      @OneToMany
      private List<Show> shows = new ArrayList<>();
      
      @ElementCollection
      @Enumerated
      private List<MovieFeature> features = new ArrayList<>();
}

