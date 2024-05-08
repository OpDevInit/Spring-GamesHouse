package com.game_save.game_save.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
public class Saves extends Games {
    @Column(name = "personagem_no_jogo")
    private String namePersonSave;
    @Column(name = "local_de_salvamento")
    private String localSaved;

    public Saves(Integer id, String name, String producer, String namePersonSave, String localSaved) {
        super(id, name, producer);
        this.namePersonSave = namePersonSave;
        this.localSaved = localSaved;
    }

}
