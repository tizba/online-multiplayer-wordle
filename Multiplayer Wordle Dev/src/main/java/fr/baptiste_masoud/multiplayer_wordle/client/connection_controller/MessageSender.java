package fr.baptiste_masoud.multiplayer_wordle.client.connection_controller;

import fr.baptiste_masoud.multiplayer_wordle.messages.c_to_s.ClientToServerMessage;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSender {
    private final ConnectionController connectionController;
    private final ObjectOutputStream objectOutputStream;

    public MessageSender(ConnectionController connectionController, ObjectOutputStream objectOutputStream) {
        this.connectionController = connectionController;
        this.objectOutputStream = objectOutputStream;
    }

    public void sendMessage(ClientToServerMessage message) {
        try {
            System.out.println("Message sent: " + message.getMessageType());
            this.objectOutputStream.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}