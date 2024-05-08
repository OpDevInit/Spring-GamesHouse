package com.opdevinit.gameuser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;

    public UserRole() {
    }

    public UserRole(Long id, String roleName) {
        super();
        this.id = id;
        this.roleName = roleName;
    }

}
