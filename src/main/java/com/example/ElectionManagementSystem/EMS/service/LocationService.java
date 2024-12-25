package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.Location;
import com.example.ElectionManagementSystem.EMS.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location) {
        return this.locationRepository.save(location);
    }

    public List<Location> getAllLocations() {
        return this.locationRepository.findAll();
    }

    public Location getLocationById(Long id) {
        return this.locationRepository.findById(id).orElse(null);
    }

    public Location updateLocation(Long id, Location updatedLocation) {
        Optional<Location> existingLocation = this.locationRepository.findById(id);
        if (existingLocation.isPresent()) {
            Location location = existingLocation.get();
            location.setCountry_id(updatedLocation.getCountry_id());
            location.setCountry_name(updatedLocation.getCountry_name());
            location.setState_id(updatedLocation.getState_id());
            location.setState_name(updatedLocation.getState_name());
            location.setConstitution_id(updatedLocation.getConstitution_id());
            location.setConstitution_name(updatedLocation.getConstitution_name());
            location.setPart_id(updatedLocation.getPart_id());
            location.setVoting_area_id(updatedLocation.getVoting_area_id());
            location.setWard_id(updatedLocation.getWard_id());
            location.setPart_name(updatedLocation.getPart_name());
            location.setVoting_area_name(updatedLocation.getVoting_area_name());
            location.setWard_name(updatedLocation.getWard_name());
            return this.locationRepository.save(location);
        } else {
            return null;
        }
    }

    public void deleteLocation(Long id) {
        this.locationRepository.deleteById(id);
    }
}