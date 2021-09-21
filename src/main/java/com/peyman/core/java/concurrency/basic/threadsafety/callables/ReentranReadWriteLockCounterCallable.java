package com.peyman.core.java.concurrency.basic.threadsafety.callables;


import com.peyman.core.java.concurrency.basic.threadsafety.services.ReentrantReadWriteLockCounter;

import java.util.concurrent.Callable;

public class ReentranReadWriteLockCounterCallable implements Callable<Integer> {

    private final ReentrantReadWriteLockCounter counter;

    public ReentranReadWriteLockCounterCallable(ReentrantReadWriteLockCounter counter) {
        this.counter = counter;
    }
    
    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }

}
