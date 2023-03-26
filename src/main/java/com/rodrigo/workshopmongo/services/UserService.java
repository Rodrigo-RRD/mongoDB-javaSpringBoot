package com.rodrigo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.workshopmongo.domain.User;
import com.rodrigo.workshopmongo.repository.UserRepository;

@Service
public class UserService {
    
//quando declara um objeto dentro de uma 
//classe usando o Autowired o proprio spring vai procurar 
//a definição desse objeto e vai instanciar ele (Injeção de dependencia) do spring
    @Autowired
    private UserRepository userJpaRepository;;

    public List<User> findAll(){
    return userJpaRepository.findAll();  //retorna todos os objetos do tipo usuario
    }
}
