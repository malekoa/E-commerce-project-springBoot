package com.jtspringproject.JtSpringProject.Service;

import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Qualifier("userRepository")
    @Autowired
    private UserRepository repository;

    public User createUser(User user){
        return repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUserByName(String username){
        return repository.findByUsername(username);
    }
}
