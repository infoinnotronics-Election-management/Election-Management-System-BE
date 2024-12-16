package com.example.demo.repository;

import com.example.demo.entity.MasterUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterUserRepository extends JpaRepository<MasterUser, Long> {
    MasterUser findByUsername(String username);
}
