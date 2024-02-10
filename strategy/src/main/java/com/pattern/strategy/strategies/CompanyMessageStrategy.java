package com.pattern.strategy.strategies;

import com.pattern.strategy.model.MessageContent;
import com.pattern.strategy.model.MessageType;

public class CompanyMessageStrategy implements MessageStrategy {

    @Override public boolean apply(MessageType messageType) {
        return MessageType.COMPANY.equals(messageType);
    }

    @Override public void processMessage(MessageContent messageContent) {
        System.out.println("Processing company message: " + messageContent.getMessageContent());
    }
}
