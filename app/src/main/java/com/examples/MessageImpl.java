package com.examples;

public class MessageImpl implements iMessage{
    @Override
    public void sendMessage() {
        System.out.println("sending message from impl");
    }
}
