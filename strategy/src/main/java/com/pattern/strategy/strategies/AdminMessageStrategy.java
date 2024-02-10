package com.pattern.strategy.strategies;

import com.pattern.strategy.model.MessageContent;
import com.pattern.strategy.model.MessageType;

public class AdminMessageStrategy implements MessageStrategy {

    @Override public boolean apply(MessageType messageType) {
        return MessageType.ADMIN.equals(messageType);
    }

    @Override public void processMessage(MessageContent messageContent) {
        System.out.println("Processing admin message: " + messageContent.getMessageContent());
    }
}
