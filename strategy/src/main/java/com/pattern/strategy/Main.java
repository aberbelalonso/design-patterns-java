package com.pattern.strategy;

import com.pattern.strategy.model.Message;
import com.pattern.strategy.model.MessageContent;
import com.pattern.strategy.model.MessageType;
import com.pattern.strategy.service.MessageProcessorService;

public class Main {
    private static final MessageProcessorService messageProcessorService = new MessageProcessorService();

    public static void main(String[] args) {
        // We'll be receiving different types of messages that will be managed at execution time
        Message userMessage = Message.createMessage(MessageType.USER, new MessageContent("userMessageContent"));
        messageProcessorService.processMessage(userMessage);
        Message companyMessage = Message.createMessage(MessageType.COMPANY, new MessageContent("companyMessageContent"));
        messageProcessorService.processMessage(companyMessage);
        Message adminMessage = Message.createMessage(MessageType.ADMIN, new MessageContent("adminMessageContent"));
        messageProcessorService.processMessage(adminMessage);
    }
}