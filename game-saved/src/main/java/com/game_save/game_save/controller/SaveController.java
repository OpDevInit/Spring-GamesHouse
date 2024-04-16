package com.game_save.game_save.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.game_save.game_save.entities.Saves;
import com.game_save.game_save.repository.SaveRepository;
import com.game_save.game_save.services.SaveServices;

@RestController
@RequestMapping("/saves")
public class SaveController {

    @Autowired
    public SaveServices saveServices;
    @Autowired
    public SaveRepository saveRepository;

    @GetMapping()
    public ResponseEntity<List<Saves>> getSaves() {
        return new ResponseEntity<List<Saves>>(saveServices.getSaves(), HttpStatus.OK);
    }

    @GetMapping("find/{id}")
    public List<Saves> getSavesById(@PathVariable Integer id) {
        return saveServices.getSavesById(id);
    }

    @PostMapping("/newsave/{gamesId}")
    public ResponseEntity<Saves> newSave(@PathVariable Integer gamesId, @RequestBody Saves savesData) {
        Saves save = saveServices.postNewSave(gamesId, savesData);
        return new ResponseEntity<Saves>(save, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Saves> replaceSave(@PathVariable Integer id, @RequestBody Saves saveData) {
        return new ResponseEntity<Saves>(saveServices.replaceSave(id, saveData), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public void deleteSave(@PathVariable Integer id) {
        saveServices.deleteSave(id);
    }

}
