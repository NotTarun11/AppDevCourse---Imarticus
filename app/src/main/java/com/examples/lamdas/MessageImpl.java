package com.examples.lamdas;

import com.examples.lamdas.iMessage;

public class MessageImpl implements iMessage {
    @Override
    public void sendMessage() {
        System.out.println("sending message from impl");
    }
}
