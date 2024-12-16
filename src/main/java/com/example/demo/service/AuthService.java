package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PasswordResetToken;
import com.example.demo.entity.User;
import com.example.demo.repository.PasswordResetTokenRepository;
import com.example.demo.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Autowired
    private EmailService emailService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    // Forgot Password Logic
    public void processForgotPassword(String email) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User with email not found.");
        }

        // Generate Reset Token
        User user = userOptional.get();
        String token = UUID.randomUUID().toString();

        // Save Token
        PasswordResetToken resetToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(resetToken);

        // Send Email
        String resetLink = token;
        emailService.sendEmail(
            user.getEmail(),
            "Password Reset Request",
            "Your Secret code Is : " + resetLink
        );
    }

    // Reset Password Logic
    public void processResetPassword(String token, String newPassword) {
        PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(token)
                .orElseThrow(() -> new RuntimeException("Invalid or expired reset token."));

        User user = resetToken.getUser();

        // Reset Password
        user.setPassword(newPassword);
        userRepository.save(user);

        // Invalidate the token
        passwordResetTokenRepository.delete(resetToken);
    }
}
