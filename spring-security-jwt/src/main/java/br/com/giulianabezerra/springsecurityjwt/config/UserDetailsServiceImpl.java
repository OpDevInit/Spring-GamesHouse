package br.com.giulianabezerra.springsecurityjwt.config;


import java.lang.System.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import br.com.giulianabezerra.springsecurityjwt.entities.User;
import br.com.giulianabezerra.springsecurityjwt.feign.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    private UserRepository repository;
    private User user;
    public UserDetailsServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = repository.findByEmail(username).getBody();
       if(user ==null){
        throw new UsernameNotFoundException("Email Not found");
       }
       return user;
    }
    


}