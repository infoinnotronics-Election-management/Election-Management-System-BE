package com.example.ElectionManagementSystem.EMS.service;

import java.util.List;
import java.util.Optional;

import com.example.ElectionManagementSystem.EMS.Entities.Location;
import com.example.ElectionManagementSystem.EMS.repository.LocationRepository;
import org.springframework.stereotype.Service;

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
        Optional<Location> optionalLocation = this.locationRepository.findById(id);
        if (optionalLocation.isPresent()) {
            Location existingLocation = optionalLocation.get();
            existingLocation.setName(updatedLocation.getName());
            existingLocation.setState(updatedLocation.getState());
            existingLocation.setRegion(updatedLocation.getRegion());
            return this.locationRepository.save(existingLocation);
        } else {
            return null;
        }
    }

    public void deleteLocation(Long id) {
        this.locationRepository.deleteById(id);
    }
}