package com.jtspringproject.JtSpringProject.Service;

import com.jtspringproject.JtSpringProject.Entity.User;
import com.jtspringproject.JtSpringProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Service class for managing User entities.
 */
@Service
public class UserService {

    @Qualifier("userRepository")
    @Autowired
    private UserRepository repository;

    /**
     * Creates a new user.
     *
     * @param user The User entity to create.
     * @return The created User entity.
     */
    public User createUser(User user){
        return repository.save(user);
    }

    /**
     * Retrieves a list of all users.
     *
     * @return A List containing all User entities.
     */
    public List<User> getAllUsers(){
        return repository.findAll();
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param id The ID of the user to retrieve.
     * @return The User entity with the provided ID, or null if not found.
     */
    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    /**
     * Retrieves a user by their username.
     *
     * @param username The username of the user to retrieve.
     * @return The User entity with the provided username, or null if not found.
     */
    public User getUserByName(String username){
        return repository.findByUsername(username);
    }
}

