package com.example.ElectionManagementSystem.EMS.service;


import java.util.List;

import com.example.ElectionManagementSystem.EMS.Entities.User;
import com.example.ElectionManagementSystem.EMS.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return (User)this.userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User getUserById(Long id) {
        return (User)this.userRepository.findById(id).orElse((User) null);
    }

    public User updateUser(Long id, User updatedUser) {
        User existingUser = (User)this.userRepository.findById(id).orElse((User) null);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setContactInfo(updatedUser.getContactInfo());
            existingUser.setIsActive(updatedUser.getIsActive());
            existingUser.setRole(updatedUser.getRole());
            return (User)this.userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
