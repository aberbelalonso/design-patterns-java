package com.pattern.strategy.service;

import com.pattern.strategy.model.Message;
import com.pattern.strategy.strategies.AdminMessageStrategy;
import com.pattern.strategy.strategies.CompanyMessageStrategy;
import com.pattern.strategy.strategies.MessageStrategy;
import com.pattern.strategy.strategies.UserMessageStrategy;

import java.util.ArrayList;
import java.util.List;

public class MessageProcessorService {

    private static final List<MessageStrategy> messageStrategyList =
            new ArrayList<>(List.of(
                    new UserMessageStrategy(),
                    new CompanyMessageStrategy(),
                    new AdminMessageStrategy()));
    public void processMessage(Message message){
        messageStrategyList.stream()
                .filter(strategy -> strategy.apply(message.getMessageType()))
                .forEach(strategy -> strategy.processMessage(message.getMessageContent()));
    }
}
