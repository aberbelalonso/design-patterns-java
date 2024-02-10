package com.pattern.strategy.model;

public class Message {
    private MessageType messageType;
    private MessageContent messageContent;

    private Message(MessageType messageType, MessageContent messageContent) {
        this.messageType = messageType;
        this.messageContent = messageContent;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public MessageContent getMessageContent() {
        return messageContent;
    }

    public static Message createMessage(MessageType messageType, MessageContent messageContent){
        return new Message(messageType, messageContent);
    }
}
