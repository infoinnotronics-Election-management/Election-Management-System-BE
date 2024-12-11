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
@Table(
        name = "users"
)
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "user_id"
    )
    private Long userId;
    @Column(
            nullable = false,
            unique = true
    )
    private String username;
    @Column(
            nullable = false
    )
    private String password;
    @Column(
            name = "contact_info"
    )
    private String contactInfo;
    @Column(
            name = "is_active",
            nullable = false
    )
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(
            name = "role_id",
            nullable = false
    )
    private Role role;

    public User() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Entity
    @Table(
            name = "locations"
    )
    public static class Location {
        @Id
        @GeneratedValue(
                strategy = GenerationType.IDENTITY
        )
        @Column(
                name = "location_id"
        )
        private Long locationId;
        @Column(
                nullable = false
        )
        private String name;
        private String state;
        private String region;

        public Location() {
        }

        public Long getLocationId() {
            return this.locationId;
        }

        public void setLocationId(Long locationId) {
            this.locationId = locationId;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return this.state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
