package com.gamehouse.gamehouse.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamehouse.gamehouse.entities.Games;

@Repository
public interface GamesRepository extends JpaRepository<Games, Integer>  {
        List<Games> findByName(String name);

}
