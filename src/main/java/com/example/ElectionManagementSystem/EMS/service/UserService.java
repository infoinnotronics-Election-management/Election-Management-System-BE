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
            existingUser.setUser_password(updatedUser.getUser_password());
            existingUser.setUser_email(updatedUser.getUser_email());
            existingUser.setMaster_id(updatedUser.getMaster_id());
            existingUser.setUser_role_id(updatedUser.getUser_role_id());
            existingUser.setUser_role(updatedUser.getUser_role());
            existingUser.setCountry_id(updatedUser.getCountry_id());
            existingUser.setCountry_name(updatedUser.getCountry_name());
            existingUser.setState_id(updatedUser.getState_id());
            existingUser.setState_name(updatedUser.getState_name());
            existingUser.setConstitution_id(updatedUser.getConstitution_id());
            existingUser.setConstitution_name(updatedUser.getConstitution_name());
            existingUser.setPart_id(updatedUser.getPart_id());
            existingUser.setVoting_area_id(updatedUser.getVoting_area_id());
            existingUser.setWard_id(updatedUser.getWard_id());
            existingUser.setPart_name(updatedUser.getPart_name());
            existingUser.setVoting_area_name(updatedUser.getVoting_area_name());
            existingUser.setWard_name(updatedUser.getWard_name());
            return this.userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}