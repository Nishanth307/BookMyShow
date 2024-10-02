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
//@Table(name="city")for changing the table name
public class City extends BaseModel{
      private String name;

      @OneToMany // or @OneToMany(fetch=FetchType.EAGER,mappedBy="city")
      private List<Theater> theaters = new ArrayList<>();
}
