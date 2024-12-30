package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_master")
public class UserMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "master_id", nullable = false)
    private Long masterId;

    @Column(name = "master_username", nullable = false, length = 255)
    private String masterUsername;

    @Column(name = "master_password", nullable = false, length = 255)
    private String masterPassword;

    @Column(name = "master_email", length = 255)
    private String masterEmail;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name", length = 255)
    private String countryName;

    @Column(name = "state_id")
    private Integer stateId;

    @Column(name = "state_name", length = 255)
    private String stateName;

    @Column(name = "district_id", columnDefinition = "VARCHAR(255)")
    private String districtId;

    @Column(name = "district_name", columnDefinition = "VARCHAR(255)")
    private String districtName;
    @Column(name = "constitution_id")
    private Integer constitutionId;

    @Column(name = "constitution_name", length = 255)
    private String constitutionName;

    @Column(name = "part_id")
    private Integer partId;

    @Column(name = "part_name", length = 255)
    private String partName;

    @Column(name = "ward_id")
    private Integer wardId;

    @Column(name = "ward_name", length = 255)
    private String wardName;

    @Column(name = "voting_area_id")
    private Integer votingAreaId;

    @Column(name = "voting_area_name", length = 255)
    private String votingAreaName;
    // Getters and Setters
    public Long getMasterId() {
        return masterId;
    }

    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    public String getMasterUsername() {
        return masterUsername;
    }

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    public String getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword;
    }

    public String getMasterEmail() {
        return masterEmail;
    }

    public void setMasterEmail(String masterEmail) {
        this.masterEmail = masterEmail;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    public Integer getConstitutionId() {
        return constitutionId;
    }

    public void setConstitutionId(Integer constitutionId) {
        this.constitutionId = constitutionId;
    }

    public String getConstitutionName() {
        return constitutionName;
    }

    public void setConstitutionName(String constitutionName) {
        this.constitutionName = constitutionName;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getWardId() {
        return wardId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public Integer getVotingAreaId() {
        return votingAreaId;
    }

    public void setVotingAreaId(Integer votingAreaId) {
        this.votingAreaId = votingAreaId;
    }

    public String getVotingAreaName() {
        return votingAreaName;
    }

    public void setVotingAreaName(String votingAreaName) {
        this.votingAreaName = votingAreaName;
    }
}
