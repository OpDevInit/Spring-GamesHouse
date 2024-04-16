package br.com.giulianabezerra.springsecurityjwt.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.giulianabezerra.springsecurityjwt.entities.User;

@Repository
@FeignClient(value = "gameuser", path = "/users")
public interface UserRepository {
    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email);
}
