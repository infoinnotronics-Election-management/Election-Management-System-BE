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
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setMobile(updatedUser.getMobile());
            existingUser.setUserLevel(updatedUser.getUserLevel());
            existingUser.setElectionType(updatedUser.getElectionType());
            existingUser.setCountry(updatedUser.getCountry());
            existingUser.setState(updatedUser.getState());
            existingUser.setStatus(updatedUser.getStatus());
            return this.userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
