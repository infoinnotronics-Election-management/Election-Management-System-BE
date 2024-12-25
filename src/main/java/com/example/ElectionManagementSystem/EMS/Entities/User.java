package com.example.ElectionManagementSystem.EMS.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name="username",nullable = false)
    private String username;

    @Column(nullable = false)
    private String user_password;

    private String user_email;
    private int master_id;
    private int user_role_id;
    private String user_role;
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
    public User(){

    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getMaster_id() {
        return master_id;
    }

    public void setMaster_id(int master_id) {
        this.master_id = master_id;
    }

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
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


}
