package com.BookShopManager.BookShopManager.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig  {
    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        return httpSecurity.authorizeHttpRequests(registry->{
            registry.requestMatchers("/home").permitAll();
            registry.requestMatchers("admin");
        });
    }*/
}
