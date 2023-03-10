package com.pattern.template.service.registration;

import com.pattern.template.model.User;
import com.pattern.template.repository.UserRepository;
import com.pattern.template.security.SecurityContext;
import com.pattern.template.service.notification.NotificationService;

public final class UserRegistrationService extends AbstractRegistrationService {

    public UserRegistrationService(UserRepository userRepository,
            SecurityContext securityContext,
            NotificationService notificationService) {

        super(userRepository, securityContext, notificationService);
    }

    @Override
    protected boolean isAuthorized() {
        return securityContext.canCreateUsers();
    }

    @Override
    protected void notifyUserCreation(User user) {
        notificationService.notifyUserCreation(user);
    }
}
