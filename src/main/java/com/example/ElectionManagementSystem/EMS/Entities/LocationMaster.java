package com.example.ElectionManagementSystem.EMS.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "location_master")
public class LocationMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Long countryId;

    @Column(name = "country_name", nullable = false, length = 255)
    private String countryName;

    @Column(name = "state_id", nullable = true)
    private Integer stateId;

    @Column(name = "state_name", length = 255)
    private String stateName;

    @Column(name = "district_id", columnDefinition = "VARCHAR(255)")
    private String districtId;

    @Column(name = "district_name", columnDefinition = "VARCHAR(255)")
    private String districtName;

    @Column(name = "constitution_id", nullable = true)
    private Integer constitutionId;

    @Column(name = "constitution_name", length = 255)
    private String constitutionName;

    @Column(name = "part_id", nullable = true)
    private Integer partId;

    @Column(name = "part_name", length = 255)
    private String partName;

    @Column(name = "ward_id", nullable = true)
    private Integer wardId;

    @Column(name = "ward_name", length = 255)
    private String wardName;

    @Column(name = "voting_area_id", nullable = true)
    private Integer votingAreaId;

    @Column(name = "voting_area_name", length = 255)
    private String votingAreaName;

    // Getters and Setters
    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
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
