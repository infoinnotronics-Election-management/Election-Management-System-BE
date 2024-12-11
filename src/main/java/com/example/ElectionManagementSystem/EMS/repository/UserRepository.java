package com.example.ElectionManagementSystem.EMS.repository;


import com.example.ElectionManagementSystem.EMS.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
