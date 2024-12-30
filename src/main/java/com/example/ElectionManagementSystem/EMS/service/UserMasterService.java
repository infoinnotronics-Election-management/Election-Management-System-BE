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
            existingUserMaster.setMasterUsername(updatedUserMaster.getMasterUsername());
            existingUserMaster.setMasterPassword(updatedUserMaster.getMasterPassword());
            existingUserMaster.setMasterEmail(updatedUserMaster.getMasterEmail());
            existingUserMaster.setCountryId(updatedUserMaster.getCountryId());
            existingUserMaster.setCountryName(updatedUserMaster.getCountryName());
            existingUserMaster.setStateId(updatedUserMaster.getStateId());
            existingUserMaster.setStateName(updatedUserMaster.getStateName());
            existingUserMaster.setDistrictId(updatedUserMaster.getDistrictId());
            existingUserMaster.setDistrictName(updatedUserMaster.getDistrictName());
            existingUserMaster.setConstitutionId(updatedUserMaster.getConstitutionId());
            existingUserMaster.setConstitutionName(updatedUserMaster.getConstitutionName());
            existingUserMaster.setPartId(updatedUserMaster.getPartId());
            existingUserMaster.setPartName(updatedUserMaster.getPartName());
            existingUserMaster.setWardId(updatedUserMaster.getWardId());
            existingUserMaster.setWardName(updatedUserMaster.getWardName());
            existingUserMaster.setVotingAreaId(updatedUserMaster.getVotingAreaId());
            existingUserMaster.setVotingAreaName(updatedUserMaster.getVotingAreaName());
            return this.userMasterRepository.save(existingUserMaster);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        this.userMasterRepository.deleteById(id);
    }
}
