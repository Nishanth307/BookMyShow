package com.bms.bms.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bms.bms.models.enums.Language;
import com.bms.bms.models.enums.MovieFeature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="shows")//for changing the table name
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Show extends BaseModel{
      /*
      Back refernce not needed
      @ManyToOne
      @JoinColumn(name="movie_id") //implment in movie
      private Movie movie;
       */
      @ManyToOne
      private Movie movie;

      private Date startTime;
      private Integer duartion;

      @ManyToOne
      private Hall hall ;

      @OneToMany
      private List<ShowSeat> showSeats = new ArrayList<>();

      // ####
      @Enumerated
      @ElementCollection
      private List<MovieFeature> movieFeatures = new ArrayList<>();
      
      @ElementCollection
      @Enumerated
      private List<Language> languages = new ArrayList<>();
}


