package com.rodrigo.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.workshopmongo.dto.UserDTO;
import com.rodrigo.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET) //ou pode colocar Getmapping
    public ResponseEntity<List<UserDTO>> findAll(){   
        List<com.rodrigo.workshopmongo.domain.User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto); //no corpo da minha resposta vai ter o body que salvou
    } 
}
