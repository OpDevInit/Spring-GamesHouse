package br.com.giulianabezerra.springsecurityjwt.entities;

import lombok.Data;

@Data
public class UserRole {
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
