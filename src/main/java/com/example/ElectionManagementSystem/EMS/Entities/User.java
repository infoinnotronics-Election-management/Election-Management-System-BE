package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "user_password", nullable = false, length = 255)
    private String userPassword;

    @Column(name = "user_email", length = 255)
    private String userEmail;

    @Column(name = "master_id")
    private Integer masterId;

    @Column(name = "user_role_id")
    private Integer userRoleId;

    @Column(name = "user_role", length = 255)
    private String userRole;

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
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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