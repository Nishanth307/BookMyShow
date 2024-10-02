package com.bms.bms.models;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theater extends BaseModel{
      /*
      @ManyToOne
      @JoinColumn(name="city_id")
      private City city;
       */
      private String name;
      private String address;

      @OneToMany //(fetch=FetchType.EAGER,mappedBy="theater")check spelling if any error
      private List<Hall> halls = new ArrayList<>();

      @OneToMany
      private List<Show> shows = new ArrayList<>();


}

