package com.pattern.template.service.notification;

import com.pattern.template.model.User;

public class NotificationServiceImpl implements NotificationService {

    @Override public void notifyUserCreation(User user) {
        System.out.println("Notifying user creation: " + user);
    }
}
