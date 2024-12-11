package com.example.ElectionManagementSystem.EMS.repository;

import com.example.ElectionManagementSystem.EMS.Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}