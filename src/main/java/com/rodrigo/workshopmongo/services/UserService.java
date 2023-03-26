package com.rodrigo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.workshopmongo.domain.User;
import com.rodrigo.workshopmongo.dto.UserDTO;
import com.rodrigo.workshopmongo.repository.UserRepository;
import com.rodrigo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    // quando declara um objeto dentro de uma
    // classe usando o Autowired o proprio spring vai procurar
    // a definição desse objeto e vai instanciar ele (Injeção de dependencia) do
    // spring
    @Autowired
    private UserRepository userJpaRepository;;

    public List<User> findAll() {
        return userJpaRepository.findAll(); // retorna todos os objetos do tipo usuario
    }

    public User findById(String id) {
        Optional<User> obj = userJpaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return userJpaRepository.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

    public void delete(String id) {
        findById(id);
        userJpaRepository.deleteById(id);
    }

}
