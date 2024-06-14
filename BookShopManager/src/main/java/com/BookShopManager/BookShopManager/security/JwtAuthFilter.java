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

    private final JwtService jwtService;
    @Override
    protected void doFilterInternal(
                                    @NonNull HttpServletRequest httpServletRequest,
                                    @NonNull HttpServletResponse httpServeletResponse,
                                    @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        final String authHeader = httpServletRequest.getHeader("Authorization");
        final String userEmail;
        final String jwtToken;
        if(authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(httpServletRequest,httpServeletResponse);
            return ;
        }
        jwtToken = authHeader.substring(7);
        userEmail=jwtService.extractUsername(jwtToken);
    }
}
