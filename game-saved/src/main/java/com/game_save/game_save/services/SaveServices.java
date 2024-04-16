package com.game_save.game_save.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import com.game_save.game_save.entities.Games;
import com.game_save.game_save.entities.Saves;
import com.game_save.game_save.feignClients.GamesFeignClients;
import com.game_save.game_save.repository.SaveRepository;

@Service
public class SaveServices {

   @Autowired
   private GamesFeignClients gamesFeignClients;
   @Autowired
   private SaveRepository saveRepository;

   Saves saves;

   public List<Saves> getSaves() {
      List<Saves> saves = saveRepository.findAll();
      if (saves.isEmpty()) {
         return null;
      } else {
         return saveRepository.findAll();
      }
   }

   @Retryable(retryFor = java.util.NoSuchElementException.class, maxAttempts = 2, backoff = @Backoff(delay = 100))
   public List<Saves> getSavesById(Integer id) {
      return List.of(saveRepository.findById(id).get());

   }

   @Recover
   public List<Saves> getSavesByIdNotFound(Integer id) {
      return List.of(new Saves(id,
            null,
            null,
            null,
            null));

   }

   public Saves postNewSave(Integer gamesId, Saves savesData) {
      Games games = gamesFeignClients.getGameById(gamesId).getBody();
      Saves save = new Saves(gamesId,
            games.getName(),
            games.getProducer(),
            savesData.getNamePersonSave(),
            savesData.getLocalSaved());
      return saveRepository.save(save);

   }

   public Saves replaceSave(Integer id, Saves saveData) {
      Games games = gamesFeignClients.getGameById(id).getBody();
      Saves saves = new Saves(id,
            games.getName(),
            games.getProducer(),
            saveData.getNamePersonSave(),
            saveData.getLocalSaved());
      saves.setId(id);
      return saveRepository.save(saves);
   }

   public void deleteSave(Integer id) {
      saveRepository.deleteById(id);

   }

}
