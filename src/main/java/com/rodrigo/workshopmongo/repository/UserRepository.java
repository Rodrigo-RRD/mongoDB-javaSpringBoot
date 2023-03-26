package com.rodrigo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {


    //so com isso da pra fazer varias operações basicas com os usuarios
    //deletar, recuperar, atualizar etc...
}
