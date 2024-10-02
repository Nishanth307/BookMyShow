package com.bms.bms.models;
import java.util.ArrayList;
import java.util.List;

import com.bms.bms.models.enums.MovieFeature;
import com.bms.bms.models.enums.Language;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
//@Table(name="city")for changing the table name
public class Movie extends BaseModel{
      private String name;
      private String genre;
      private Double rating;

      
      @ElementCollection
      @Enumerated
      private List<Language> languages = new ArrayList<>();
      
      @ElementCollection
      @Enumerated
      private List<MovieFeature> features = new ArrayList<>();
      
      
}

