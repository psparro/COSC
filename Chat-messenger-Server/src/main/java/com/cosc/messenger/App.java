package com.cosc.messenger;

import com.cosc.messenger.server.Server;

public class App {

    public static void main(String[] args) {

        Runnable runnable = new Server(8818);
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
