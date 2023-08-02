package com.jtspringproject.JtSpringProject.Repository;

import com.jtspringproject.JtSpringProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {
    // Default methods are save(), findByID(), findAll(), deleteById()

    @Query(value = "SELECT * FROM User WHERE User.username = ?1", nativeQuery = true)// ?1 corresponds to first parameter passed in the function
    User findByUsername(String username);


}