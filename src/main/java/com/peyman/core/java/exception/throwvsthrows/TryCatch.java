package com.peyman.core.java.exception.throwvsthrows;

import com.sun.mail.iap.ConnectionException;

import java.net.SocketException;

public class TryCatch {

    public void execute() throws SocketException, ConnectionException, Exception  {
        //code that would throw any of: SocketException, ConnectionException, Exception
    }

}
