package fr.baptiste_masoud.online_multiplayer_wordle.messages.s_to_c;

public class SuccessfulDisconnectionMessage extends ServerToClientMessage {
    public SuccessfulDisconnectionMessage() {
        super(ServerToClientMessageType.SUCCESSFUL_DISCONNECTION);
    }
}
