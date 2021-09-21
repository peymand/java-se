package com.peyman.core.java.concurrency.advanced.threadlocal;

import java.util.UUID;


public class UserRepository {
    String getUserNameForUserId(Integer userId) {
        return UUID.randomUUID().toString();
    }
}
