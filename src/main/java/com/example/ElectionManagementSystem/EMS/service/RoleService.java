package com.example.ElectionManagementSystem.EMS.service;

import com.example.ElectionManagementSystem.EMS.Entities.Role;
import com.example.ElectionManagementSystem.EMS.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // Save a new role
    public Role saveRole(Role role) {
        return this.roleRepository.save(role);
    }

    // Get all roles
    public List<Role> getAllRoles() {
        return this.roleRepository.findAll();
    }

    // Get role by ID
    public Role getRoleById(Long id) {
        Optional<Role> role = this.roleRepository.findById(id);
        return role.orElse(null);  // return null if not found
    }

    // Update an existing role
    public Role updateRole(Long id, Role updatedRole) {
        Optional<Role> existingRoleOptional = this.roleRepository.findById(id);
        if (existingRoleOptional.isPresent()) {
            Role existingRole = existingRoleOptional.get();
            existingRole.setUserRole(updatedRole.getUserRole());
            return this.roleRepository.save(existingRole);
        }
        return null; // return null if not found
    }

    // Delete a role
    public void deleteRole(Long id) {
        this.roleRepository.deleteById(id);
    }
}
