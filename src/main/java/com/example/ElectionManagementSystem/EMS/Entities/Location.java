package com.example.ElectionManagementSystem.EMS.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
        name = "locations"
)
public class Location {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "country_id"
    )
    private Long country_id;
    @Column(
            nullable = false
    )
    private String country_name;
    private int state_id;
    private String state_name;
    private  int constitution_id;
    private String constitution_name;
    private  int part_id;
    private  int voting_area_id;
    private  int ward_id;
    private  String part_name;
    private  String voting_area_name;

    private  String ward_name;
    public Location() {
    }
    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public int getConstitution_id() {
        return constitution_id;
    }

    public void setConstitution_id(int constitution_id) {
        this.constitution_id = constitution_id;
    }

    public String getConstitution_name() {
        return constitution_name;
    }

    public void setConstitution_name(String constitution_name) {
        this.constitution_name = constitution_name;
    }

    public int getPart_id() {
        return part_id;
    }

    public void setPart_id(int part_id) {
        this.part_id = part_id;
    }

    public int getVoting_area_id() {
        return voting_area_id;
    }

    public void setVoting_area_id(int voting_area_id) {
        this.voting_area_id = voting_area_id;
    }

    public int getWard_id() {
        return ward_id;
    }

    public void setWard_id(int ward_id) {
        this.ward_id = ward_id;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public String getVoting_area_name() {
        return voting_area_name;
    }

    public void setVoting_area_name(String voting_area_name) {
        this.voting_area_name = voting_area_name;
    }

    public String getWard_name() {
        return ward_name;
    }

    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;
    }




}
