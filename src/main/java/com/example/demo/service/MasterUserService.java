package com.example.demo.service;

import com.example.demo.entity.MasterUser;
import com.example.demo.repository.MasterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterUserService {

    @Autowired
    private MasterUserRepository masterUserRepository;

    public MasterUser createMasterUser(String username, String password, String email) {
        MasterUser masterUser = new MasterUser();
        masterUser.setUsername(username);
        masterUser.setPassword(password); 
        masterUser.setEmail(email);
        return masterUserRepository.save(masterUser);
    }

    public MasterUser findByUsername(String username) {
        return masterUserRepository.findByUsername(username);
    }
}
