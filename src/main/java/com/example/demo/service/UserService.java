package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.MasterUser;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.MasterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MasterUserRepository masterUserRepository;
    
        public User findByUsername(String username) {
            return userRepository.findByUsername(username);
        }


	public User createUser(String masterUsername, String email, String username, String password) {
        MasterUser master = masterUserRepository.findByUsername(masterUsername);

        if (master == null) {
            throw new IllegalArgumentException("Master user with username " + masterUsername + " does not exist");
        }

        User newUser = new User();
        newUser.setEmail(email);
        newUser.setUsername(username);
        newUser.setPassword(password); 
        newUser.setRole("ROLE_USER");
        newUser.setMaster(master);

        return userRepository.save(newUser);
	}
}

