package br.com.giulianabezerra.springsecurityjwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

import br.com.giulianabezerra.springsecurityjwt.entities.User;
import br.com.giulianabezerra.springsecurityjwt.feign.UserRepository;


@RestController
@RequestMapping("/auth")
public abstract class AuthenticationController {

  @Autowired
  private UserRepository repository;
  @PostMapping("/authenticate")
  public  String authenticate(){
      return "";
  }

  @GetMapping("/test")
  public String getMessage() {
    return "hhhhhhhhhhhhhhhhhhhhhhh";
  }
}