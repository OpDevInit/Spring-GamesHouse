package com.opdevinit.gameuser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opdevinit.gameuser.entities.User;
import com.opdevinit.gameuser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User user = userRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
