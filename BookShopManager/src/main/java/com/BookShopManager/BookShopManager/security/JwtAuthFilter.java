package com.BookShopManager.BookShopManager.security;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(
                                    @NonNull HttpServletRequest httpServletRequest,
                                    @NonNull HttpServletResponse httpServeletResponse,
                                    @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        final String authHeader = httpServletRequest.getHeader(AUTHORIZATION);
        final String userEmail;
        final String jwtToken;


    }
}
