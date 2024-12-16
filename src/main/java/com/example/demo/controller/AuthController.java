package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.CreateMasterRequest;
import com.example.demo.dto.CreateUserRequest;
import com.example.demo.dto.ForgotPasswordRequest;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.ResetPasswordRequest;
import com.example.demo.entity.MasterUser;
import com.example.demo.entity.User;
import com.example.demo.service.AuthService;
import com.example.demo.service.MasterUserService;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class AuthController {
   
  @Autowired
  private UserService userService;

  @Autowired
  private MasterUserService masterUserService;
  
  @Autowired
  private AuthService authService;
    
  // Master login API
  @PostMapping("/master-login")
  public String masterLogin(@RequestBody LoginRequest loginRequest) {
      MasterUser masterUser = masterUserService.findByUsername(loginRequest.getUsername());
      if (masterUser != null && masterUser.getPassword().equals(loginRequest.getPassword())) {
          return "Master login successful";
      }
      return "Invalid credentials";
  }
  
  //  API for User login
      @PostMapping("/user-login")
      public String userLogin(@RequestBody LoginRequest loginRequest) {
          User user = userService.findByUsername(loginRequest.getUsername());
          if (user == null) {
              return "User not found";
          }
          if (user.getPassword().equals(loginRequest.getPassword())) {
              return "User login successful";
          }
          return "Invalid credentials";
  }


  // Create new user by master --dashboard code (master)
  @PostMapping("/create-user")
  public String createUser(@RequestBody CreateUserRequest createUserRequest) {
      User user = userService.createUser(createUserRequest.getMasterUsername(),
    		                             createUserRequest.getEmail(),
                                         createUserRequest.getUsername(),
                                         createUserRequest.getPassword()
                                         );
      if (user != null) {
          return "User created successfully";
      }
      return "Failed to create user";
  }
  
  // Forgot Password API
  @PostMapping("/forgot-password")
  public String forgotPassword(@Valid @RequestBody ForgotPasswordRequest request) {
      authService.processForgotPassword(request.getEmail());
      return "A password reset link has been sent to your email.";
  }

  // Reset Password API
  @PostMapping("/reset-password")
  public String resetPassword(@Valid @RequestBody ResetPasswordRequest request) {
      authService.processResetPassword(request.getToken(), request.getNewPassword());
      return "Your password has been successfully reset.";
  }
  
// Master creates new Master user (not req.)
@PostMapping("/create-master")
public String createMaster(@RequestBody CreateMasterRequest createMasterRequest) {
    MasterUser masterUser = masterUserService.createMasterUser(createMasterRequest.getUsername(),
                                                               createMasterRequest.getPassword(),
                                                               createMasterRequest.getEmail());
    if (masterUser != null) {
        return "Master user created successfully";
    }
    return "Failed to create master user";
}

}
