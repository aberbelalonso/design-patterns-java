package com.pattern.strategy.strategies;

import com.pattern.strategy.model.MessageContent;
import com.pattern.strategy.model.MessageType;

public interface MessageStrategy {
    boolean apply(MessageType messageType);
    void processMessage(MessageContent messageContent);
}
