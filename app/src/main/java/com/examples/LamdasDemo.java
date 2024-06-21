package com.examples;

public class LamdasDemo {

    public static void main(String[] args) {
        //life before lamdas
        MessageImpl message = new MessageImpl();
        message.sendMessage();

        //life after lamdas
        iMessage iMessage = () -> {
            System.out.println("sending message from lamda");};
        iMessage.sendMessage();
    }
}
