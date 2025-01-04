package com.example.ElectionManagementSystem.EMS.repository;

import com.example.ElectionManagementSystem.EMS.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserEmail(String email);
}
