package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
public class ElectionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long electionTypeId;

    private String electionName;

    // Getters and Setters
    public Long getElectionTypeId() {
        return electionTypeId;
    }

    public void setElectionTypeId(Long electionTypeId) {
        this.electionTypeId = electionTypeId;
    }

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }
}
