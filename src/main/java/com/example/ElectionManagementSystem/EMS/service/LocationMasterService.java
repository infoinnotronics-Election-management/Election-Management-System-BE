package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.LocationMaster;
import com.example.ElectionManagementSystem.EMS.repository.LocationMasterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationMasterService {

    private final LocationMasterRepository locationRepository;

    public LocationMasterService(LocationMasterRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public LocationMaster saveLocation(LocationMaster location) {
        return this.locationRepository.save(location);
    }

    public List<LocationMaster> getAllLocations() {
        return this.locationRepository.findAll();
    }

    public LocationMaster getLocationById(Long id) {
        return this.locationRepository.findById(id).orElse(null);
    }

    public LocationMaster updateLocation(Long id, LocationMaster updatedLocation) {
        Optional<LocationMaster> existingLocation = this.locationRepository.findById(id);
        if (existingLocation.isPresent()) {
            LocationMaster location = existingLocation.get();
            location.setCountryId(updatedLocation.getCountryId());
            location.setCountryName(updatedLocation.getCountryName());
            location.setStateId(updatedLocation.getStateId());
            location.setStateName(updatedLocation.getStateName());
            location.setDistrictId(updatedLocation.getDistrictId());
            location.setDistrictName(updatedLocation.getDistrictName());
            location.setConstitutionId(updatedLocation.getConstitutionId());
            location.setConstitutionName(updatedLocation.getConstitutionName());
            location.setPartId(updatedLocation.getPartId());
            location.setPartName(updatedLocation.getPartName());
            location.setWardId(updatedLocation.getWardId());
            location.setWardName(updatedLocation.getWardName());
            location.setVotingAreaId(updatedLocation.getVotingAreaId());
            location.setVotingAreaName(updatedLocation.getVotingAreaName());
            return this.locationRepository.save(location);
        } else {
            return null;
        }
    }

    public void deleteLocation(Long id) {
        this.locationRepository.deleteById(id);
    }
}
