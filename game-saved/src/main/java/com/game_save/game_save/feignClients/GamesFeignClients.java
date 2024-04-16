package com.game_save.game_save.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.game_save.game_save.entities.Games;

@Component
@FeignClient(value = "gamehouse", path = "/games")
public interface GamesFeignClients {

        @GetMapping("/find/{name}")
        public ResponseEntity<List<Games>> getGameByName(@PathVariable String name);

        @GetMapping("/find/{id}")
        public ResponseEntity<Games> getGameById(@PathVariable Integer id);
}
