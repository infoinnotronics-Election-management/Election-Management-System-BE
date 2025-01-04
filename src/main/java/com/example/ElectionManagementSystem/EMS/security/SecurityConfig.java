package com.example.ElectionManagementSystem.EMS.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Disable CSRF if not needed
                .authorizeHttpRequests()
                .requestMatchers("/api/users/**").authenticated()  // Secure API endpoints
                .anyRequest().permitAll()  // Allow other requests without authentication
                .and()
                .httpBasic();  // Enable Basic Authentication

        return http.build();
    }
}
