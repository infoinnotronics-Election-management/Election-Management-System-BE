package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
public class VotingArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long votingAreaId;

    private String votingAreaName;
    private String votingAreaCode;
    private Long partId;
    private String partName;
    private Long wardId;
    private String wardName;

    // Getters and Setters
    public Long getVotingAreaId() {
        return votingAreaId;
    }

    public void setVotingAreaId(Long votingAreaId) {
        this.votingAreaId = votingAreaId;
    }

    public String getVotingAreaName() {
        return votingAreaName;
    }

    public void setVotingAreaName(String votingAreaName) {
        this.votingAreaName = votingAreaName;
    }

    public String getVotingAreaCode() {
        return votingAreaCode;
    }

    public void setVotingAreaCode(String votingAreaCode) {
        this.votingAreaCode = votingAreaCode;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Long getWardId() {
        return wardId;
    }

    public void setWardId(Long wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}
