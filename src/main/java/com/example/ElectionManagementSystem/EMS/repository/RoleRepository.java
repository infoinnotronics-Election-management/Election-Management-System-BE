package com.example.ElectionManagementSystem.EMS.repository;
import com.example.ElectionManagementSystem.EMS.Entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
