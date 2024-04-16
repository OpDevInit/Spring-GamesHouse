package com.gamehouse.gamehouse.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_games")
public class Games {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "produtora")
    private String producer;

    public Games(Integer id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

}
