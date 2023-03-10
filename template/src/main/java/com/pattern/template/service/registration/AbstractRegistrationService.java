package com.pattern.template.service.registration;

import com.pattern.template.model.User;
import com.pattern.template.repository.UserRepository;
import com.pattern.template.security.SecurityContext;
import com.pattern.template.service.notification.NotificationService;

public abstract class AbstractRegistrationService implements RegistrationService{

    private final UserRepository userRepository;

    protected SecurityContext securityContext;

    protected NotificationService notificationService;

    protected AbstractRegistrationService(UserRepository userRepository,
            SecurityContext securityContext,
            NotificationService notificationService) {

        this.userRepository = userRepository;
        this.securityContext = securityContext;
        this.notificationService = notificationService;
    }

    @Override
    public void register(User user) {

        // validate existence
        if (userRepository.exists(user)) {
            throw new RuntimeException("User exists: " + user);
        }

        // validate authorization
        if (!isAuthorized()) {
            throw new RuntimeException("Connected user is not allowed to create user: " + user);
        }

        // persist the user
        userRepository.save(user);

        // notify user creation
        notifyUserCreation(user);
    }

    protected abstract boolean isAuthorized();

    protected abstract void notifyUserCreation(User user);

}
