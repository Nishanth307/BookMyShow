package com.bms.bms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bms.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
}
