package com.example.demo.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.context.annotation.Bean;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .csrf().disable() // Disable CSRF for testing
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll() // Allow public access to authentication APIs
                .requestMatchers("/api/forgot-password").permitAll()
                .anyRequest().authenticated() // All other requests require authentication
            );

        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}









