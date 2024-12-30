package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.User;
import com.example.ElectionManagementSystem.EMS.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User getUserById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User updatedUser) {
        User existingUser = this.userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setUserPassword(updatedUser.getUserPassword());
            existingUser.setUserEmail(updatedUser.getUserEmail());
            existingUser.setMasterId(updatedUser.getMasterId());
            existingUser.setUserRoleId(updatedUser.getUserRoleId());
            existingUser.setUserRole(updatedUser.getUserRole());
            existingUser.setCountryId(updatedUser.getCountryId());
            existingUser.setCountryName(updatedUser.getCountryName());
            existingUser.setStateId(updatedUser.getStateId());
            existingUser.setStateName(updatedUser.getStateName());
            existingUser.setDistrictId(updatedUser.getDistrictId());
            existingUser.setDistrictName(updatedUser.getDistrictName());
            existingUser.setConstitutionId(updatedUser.getConstitutionId());
            existingUser.setConstitutionName(updatedUser.getConstitutionName());
            existingUser.setPartId(updatedUser.getPartId());
            existingUser.setPartName(updatedUser.getPartName());
            existingUser.setWardId(updatedUser.getWardId());
            existingUser.setWardName(updatedUser.getWardName());
            existingUser.setVotingAreaId(updatedUser.getVotingAreaId());
            existingUser.setVotingAreaName(updatedUser.getVotingAreaName());
            return this.userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
