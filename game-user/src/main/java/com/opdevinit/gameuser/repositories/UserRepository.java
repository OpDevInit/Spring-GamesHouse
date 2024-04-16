package com.opdevinit.gameuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opdevinit.gameuser.entities.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);

}
