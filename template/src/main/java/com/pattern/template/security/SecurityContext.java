package com.pattern.template.security;

public interface SecurityContext {

    boolean canCreateUsers();
    boolean isAdmin();
}
