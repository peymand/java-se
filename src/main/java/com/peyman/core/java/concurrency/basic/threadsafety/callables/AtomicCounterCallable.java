package com.peyman.core.java.concurrency.basic.threadsafety.callables;

import com.peyman.core.java.concurrency.basic.threadsafety.services.AtomicCounter;

import java.util.concurrent.Callable;

public class AtomicCounterCallable implements Callable<Integer> {

    private final AtomicCounter counter;
    
    public AtomicCounterCallable(AtomicCounter counter) {
        this.counter = counter;
    }

    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }
}
