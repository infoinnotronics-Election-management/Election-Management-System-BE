package com.example.ElectionManagementSystem.EMS.repository;

import com.example.ElectionManagementSystem.EMS.Entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
