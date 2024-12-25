package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.UserMaster;
import com.example.ElectionManagementSystem.EMS.repository.UserMasterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMasterService {

    private final UserMasterRepository userMasterRepository;

    public UserMasterService(UserMasterRepository userMasterRepository) {
        this.userMasterRepository = userMasterRepository;
    }

    public UserMaster saveUser(UserMaster user) {
        return this.userMasterRepository.save(user);
    }

    public List<UserMaster> getAllUsers() {
        return this.userMasterRepository.findAll();
    }

    public UserMaster getUserById(Long id) {
        return this.userMasterRepository.findById(id).orElse(null);
    }

    public UserMaster updateUserMaster(Long id, UserMaster updatedUserMaster) {
        UserMaster existingUserMaster = this.userMasterRepository.findById(id).orElse(null);
        if (existingUserMaster != null) {
            existingUserMaster.setMaster_username(updatedUserMaster.getMaster_username());
            existingUserMaster.setMaster_password(updatedUserMaster.getMaster_password());
            existingUserMaster.setEmail(updatedUserMaster.getEmail());
            existingUserMaster.setCountry_id(updatedUserMaster.getCountry_id());
            existingUserMaster.setCountry_name(updatedUserMaster.getCountry_name());
            existingUserMaster.setState_id(updatedUserMaster.getState_id());
            existingUserMaster.setState_name(updatedUserMaster.getState_name());
            existingUserMaster.setConstitution_id(updatedUserMaster.getConstitution_id());
            existingUserMaster.setConstitution_name(updatedUserMaster.getConstitution_name());
            existingUserMaster.setPart_id(updatedUserMaster.getPart_id());
            existingUserMaster.setVoting_area_id(updatedUserMaster.getVoting_area_id());
            existingUserMaster.setWard_id(updatedUserMaster.getWard_id());
            existingUserMaster.setPart_name(updatedUserMaster.getPart_name());
            existingUserMaster.setVoting_area_name(updatedUserMaster.getVoting_area_name());
            existingUserMaster.setWard_name(updatedUserMaster.getWard_name());
            return this.userMasterRepository.save(existingUserMaster);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userMasterRepository.deleteById(id);
    }
}