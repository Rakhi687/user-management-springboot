package com.smacx.user_management.repository;
import com.smacx.user_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Search users by name
    List<User> findByNameContainingIgnoreCase(String name);

    // Search users by email
    List<User> findByEmailContainingIgnoreCase(String email);
}