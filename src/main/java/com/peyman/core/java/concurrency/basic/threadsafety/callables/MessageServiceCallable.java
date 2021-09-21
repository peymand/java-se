package com.peyman.core.java.concurrency.basic.threadsafety.callables;

import com.peyman.core.java.concurrency.basic.threadsafety.services.MessageService;

import java.util.concurrent.Callable;

public class MessageServiceCallable implements Callable<String> {
    
    private final MessageService messageService;
    
    public MessageServiceCallable(MessageService messageService) {
        this.messageService = messageService;
    
    }
    
    @Override
    public String call() {
        return messageService.getMesssage();
    }
}
