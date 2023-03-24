package com.rodrigo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @RequestMapping(method = RequestMethod.GET) //ou pode colocar Getmapping
    public ResponseEntity <List<User>> findAll(){
        User rodrigo = new User("1", "Rodrigo Rodrigues", "rodrigo@gmail.com");
        User camilly = new User("2", "Camilly vitoria", "camilly@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(rodrigo,camilly));
        return ResponseEntity.ok().body(list); //no corpo da minha resposta vai ter o body que salvou
    } 
}
