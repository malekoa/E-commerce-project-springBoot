package com.jtspringproject.JtSpringProject.Repository;

import com.jtspringproject.JtSpringProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {
    // Default methods are save(), findByID(), findAll(), deleteById()

    /**
     * Finds a user by their username.
     *
     * @param username The username of the user to find.
     * @return The User entity matching the provided username, or null if not found.
     */
    @Query(value = "SELECT * FROM User WHERE User.username = ?1", nativeQuery = true)
    User findByUsername(String username);



}