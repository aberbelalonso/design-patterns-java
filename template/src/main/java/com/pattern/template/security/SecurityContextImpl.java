package com.pattern.template.security;

public class SecurityContextImpl implements SecurityContext {

    @Override
    public boolean canCreateUsers() {
        System.out.println("Checking if connected user can create users.");
        return true;
    }

    @Override
    public boolean isAdmin() {
        System.out.println("Checking if connected user is Admin.");
        return true;
    }
}
