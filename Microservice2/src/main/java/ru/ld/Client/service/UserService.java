package ru.ld.Client.service;

import lombok.Data;
import ru.ld.Client.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ld.Client.repositories.Repository;

import java.util.List;

@Data
@Service
@AllArgsConstructor
public class UserService {
    private final Repository userRepository;


    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
    public void update(User user) {
        userRepository.save(user);
    }
    public User getUser(long id) {
        return userRepository.getById(id);
    }
}
