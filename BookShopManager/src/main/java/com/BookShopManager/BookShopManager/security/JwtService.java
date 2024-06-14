package com.BookShopManager.BookShopManager.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

import static io.jsonwebtoken.Jwts.*;

@Service
public class JwtService {

    private static final String SECRET_KEY="DqtEQR12F0VDXG52g24X8TAInFqK5OzNXpgtcbQ+37X831SfLjnIkByiJwHq6RzJ\n";

    public String extractUsername(String jwtToken) {
        return null;
    }
    public Claims extractAllClaims(String jwtToken){
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey()).build()
                .parseClaimsJws(jwtToken)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
