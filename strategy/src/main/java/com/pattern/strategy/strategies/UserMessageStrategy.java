package com.pattern.strategy.strategies;

import com.pattern.strategy.model.MessageContent;
import com.pattern.strategy.model.MessageType;

public class UserMessageStrategy implements MessageStrategy {
    @Override public boolean apply(MessageType messageType) {
        return MessageType.USER.equals(messageType);
    }

    @Override public void processMessage(MessageContent messageContent) {
        System.out.println("Processing user message: " + messageContent.getMessageContent());
    }
}
