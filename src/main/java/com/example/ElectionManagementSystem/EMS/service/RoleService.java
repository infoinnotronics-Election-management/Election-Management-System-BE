package com.example.ElectionManagementSystem.EMS.service;



import java.util.List;

import com.example.ElectionManagementSystem.EMS.Entities.Role;
import com.example.ElectionManagementSystem.EMS.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role saveRole(Role role) {
        return (Role)this.roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return this.roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return (Role)this.roleRepository.findById(id).orElse((Role) null);
    }

    public Role updateRole(Long id, Role updatedRole) {
        Role existingRole = (Role)this.roleRepository.findById(id).orElse((Role) null);
        if (existingRole != null) {
            existingRole.setRoleName(updatedRole.getRoleName());
            existingRole.setDescription(updatedRole.getDescription());
            return (Role)this.roleRepository.save(existingRole);
        } else {
            return null;
        }
    }

    public void deleteRole(Long id) {
        this.roleRepository.deleteById(id);
    }
}
