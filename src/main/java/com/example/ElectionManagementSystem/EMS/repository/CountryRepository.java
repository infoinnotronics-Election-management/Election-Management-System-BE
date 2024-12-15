package com.example.ElectionManagementSystem.EMS.repository;

import com.example.ElectionManagementSystem.EMS.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
