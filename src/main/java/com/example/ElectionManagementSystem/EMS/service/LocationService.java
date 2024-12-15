package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.Country;
import com.example.ElectionManagementSystem.EMS.Entities.State;
import com.example.ElectionManagementSystem.EMS.Entities.VotingArea;
import com.example.ElectionManagementSystem.EMS.repository.CountryRepository;
import com.example.ElectionManagementSystem.EMS.repository.StateRepository;
import com.example.ElectionManagementSystem.EMS.repository.VotingAreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    private final CountryRepository countryRepository;
    private final StateRepository stateRepository;
    private final VotingAreaRepository votingAreaRepository;

    public LocationService(CountryRepository countryRepository, StateRepository stateRepository, VotingAreaRepository votingAreaRepository) {
        this.countryRepository = countryRepository;
        this.stateRepository = stateRepository;
        this.votingAreaRepository = votingAreaRepository;
    }

    // Country Operations
    public Country saveCountry(Country country) {
        return this.countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return this.countryRepository.findAll();
    }

    public Country getCountryById(Long id) {
        Optional<Country> country = this.countryRepository.findById(id);
        return country.orElse(null);  // return null if not found
    }

    public Country updateCountry(Long id, Country updatedCountry) {
        Optional<Country> existingCountry = this.countryRepository.findById(id);
        if (existingCountry.isPresent()) {
            existingCountry.get().setCountryName(updatedCountry.getCountryName());
            return this.countryRepository.save(existingCountry.get());
        }
        return null;  // return null if not found
    }

    public void deleteCountry(Long id) {
        this.countryRepository.deleteById(id);
    }

    // State Operations
    public State saveState(State state) {
        return this.stateRepository.save(state);
    }

    public List<State> getAllStates() {
        return this.stateRepository.findAll();
    }

    public State getStateById(Long id) {
        Optional<State> state = this.stateRepository.findById(id);
        return state.orElse(null);  // return null if not found
    }

    public State updateState(Long id, State updatedState) {
        Optional<State> existingState = this.stateRepository.findById(id);
        if (existingState.isPresent()) {
            existingState.get().setStateName(updatedState.getStateName());
            return this.stateRepository.save(existingState.get());
        }
        return null;  // return null if not found
    }

    public void deleteState(Long id) {
        this.stateRepository.deleteById(id);
    }

    // VotingArea Operations
    public VotingArea saveVotingArea(VotingArea votingArea) {
        return this.votingAreaRepository.save(votingArea);
    }

    public List<VotingArea> getAllVotingAreas() {
        return this.votingAreaRepository.findAll();
    }

    public VotingArea getVotingAreaById(Long id) {
        Optional<VotingArea> votingArea = this.votingAreaRepository.findById(id);
        return votingArea.orElse(null);  // return null if not found
    }

    public VotingArea updateVotingArea(Long id, VotingArea updatedVotingArea) {
        Optional<VotingArea> existingVotingArea = this.votingAreaRepository.findById(id);
        if (existingVotingArea.isPresent()) {
            existingVotingArea.get().setVotingAreaName(updatedVotingArea.getVotingAreaName());
            existingVotingArea.get().setVotingAreaCode(updatedVotingArea.getVotingAreaCode());
            existingVotingArea.get().setPartName(updatedVotingArea.getPartName());
            existingVotingArea.get().setWardName(updatedVotingArea.getWardName());
            return this.votingAreaRepository.save(existingVotingArea.get());
        }
        return null;  // return null if not found
    }

    public void deleteVotingArea(Long id) {
        this.votingAreaRepository.deleteById(id);
    }
}
