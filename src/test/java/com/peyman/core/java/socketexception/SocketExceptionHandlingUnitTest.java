package com.peyman.core.java.socketexception;

import com.peyman.core.java.exception.socketexception.SocketClient;
import com.peyman.core.java.exception.socketexception.SocketServer;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.Executors;

public class SocketExceptionHandlingUnitTest {

    @BeforeClass
    public static void runServer() throws IOException, InterruptedException {
        Executors.newSingleThreadExecutor()
            .submit(() -> new SocketServer().start(6699));
        Thread.sleep(100);
    }

    @Test
    public void givenRunningServer_whenConnectToClosedSocket_thenHandleException() throws IOException {
        SocketClient client = new SocketClient();
        client.startConnection("127.0.0.1", 6699);
        try {
            client.sendMessage("hi");
            client.sendMessage("hi again");
        } catch (SocketException e) {
            client.stopConnection();
        }
    }

}
