package com.bms.bms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bms.models.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long>{     
} 
