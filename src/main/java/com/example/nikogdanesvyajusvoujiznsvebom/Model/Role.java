package com.example.nikogdanesvyajusvoujiznsvebom.Model;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, ROLE_CH;

    @Override
    public String getAuthority() { return name(); }
}
