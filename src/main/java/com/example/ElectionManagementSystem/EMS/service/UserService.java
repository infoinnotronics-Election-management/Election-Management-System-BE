package com.example.ElectionManagementSystem.EMS.service;//package com.example.ElectionManagementSystem.EMS.service;
import com.example.ElectionManagementSystem.EMS.Entities.User;
import com.example.ElectionManagementSystem.EMS.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        // Check if email exists
        if (userRepository.findByUserEmail(user.getUserEmail()).isPresent()) {
            throw new IllegalArgumentException("User with this email already exists");
        }

        // Check if mobile number exists
//        if (userRepository.findByMobileNumber(user.getMobileNumber()).isPresent()) {
//            throw new IllegalArgumentException("User with this mobile number already exists");
//        }

        return userRepository.save(user);
    }


    public User updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);
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
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
