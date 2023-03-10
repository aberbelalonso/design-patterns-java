package com.pattern.template;

import com.pattern.template.model.User;
import com.pattern.template.repository.UserRepository;
import com.pattern.template.repository.UserRepositoryImpl;
import com.pattern.template.security.SecurityContext;
import com.pattern.template.security.SecurityContextImpl;
import com.pattern.template.service.notification.NotificationService;
import com.pattern.template.service.notification.NotificationServiceImpl;
import com.pattern.template.service.registration.AdminRegistrationService;
import com.pattern.template.service.registration.RegistrationService;
import com.pattern.template.service.registration.UserRegistrationService;

public class Main {

    private static final UserRepository userRepository = new UserRepositoryImpl();
    private static final SecurityContext securityContext = new SecurityContextImpl();
    private static final NotificationService notificationService = new NotificationServiceImpl();

    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";

    public static void main(String[] args) {
        // The request are arriving by different endpoints (eg. rest calls).
        // The decision to use one specialization is made at compile-time, we've two specialized services.

        // PUT /users/standard
        registerStandardUser();

        // PUT /users/admin
        registerAdminUser();
    }

    private static void registerStandardUser() {
        User standard = User.asStandard(LOGIN, PASSWORD, EMAIL);
        RegistrationService standardUserService = new UserRegistrationService(userRepository, securityContext, notificationService);
        standardUserService.register(standard);
    }

    private static void registerAdminUser() {
        User admin = User.asAdmin(LOGIN, PASSWORD, EMAIL);
        RegistrationService userService = new AdminRegistrationService(userRepository, securityContext, notificationService);
        userService.register(admin);
    }
}