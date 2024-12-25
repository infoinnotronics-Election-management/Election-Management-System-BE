package com.example.ElectionManagementSystem.EMS.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_master")
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "master_id")
    private Long master_id;

    @Column(name="master_username",nullable = false)
    private String master_username;

    @Column(name = "master_password", nullable = false)
    private String master_password;

   private  String master_email;
    private  int country_id;
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
    // Getters and Setters
    public UserMaster(){

    }
    public String getMaster_username() {
        return master_username;
    }

    public void setMaster_username(String master_username) {
        this.master_username = master_username;
    }

    public String getMaster_password() {
        return master_password;
    }

    public void setMaster_password(String master_password) {
        this.master_password = master_password;
    }

    public String getEmail() {
        return master_email;
    }

    public void setEmail(String email) {
        this.master_email = email;
    }



    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
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

    public Long getMaster_id() {
        return master_id;
    }

    public void setMaster_id(Long master_id) {
        this.master_id = master_id;
    }



}
