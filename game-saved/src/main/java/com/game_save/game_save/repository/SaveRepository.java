package com.game_save.game_save.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game_save.game_save.entities.Saves;

@Repository
public interface SaveRepository extends JpaRepository<Saves, Integer> {
    List<Saves> findByName(String name);

}
