package com.pattern.template.service.registration;

import com.pattern.template.model.User;
import com.pattern.template.repository.UserRepository;
import com.pattern.template.security.SecurityContext;
import com.pattern.template.service.notification.NotificationService;

public class AdminRegistrationService extends AbstractRegistrationService {

    public AdminRegistrationService(UserRepository userRepository,
            SecurityContext securityContext,
            NotificationService notificationService) {

        super(userRepository, securityContext, notificationService);
    }

    @Override
    protected boolean isAuthorized() {
        return securityContext.isAdmin();
    }

    @Override
    protected void notifyUserCreation(User user) {
        notificationService.notifyUserCreation(user);
    }
}
