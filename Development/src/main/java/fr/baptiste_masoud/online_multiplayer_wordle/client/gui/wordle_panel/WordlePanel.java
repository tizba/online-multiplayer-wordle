package fr.baptiste_masoud.online_multiplayer_wordle.client.gui.wordle_panel;

import fr.baptiste_masoud.online_multiplayer_wordle.client.connection_controller.ConnectionController;
import fr.baptiste_masoud.online_multiplayer_wordle.messages.game_state.GameStateData;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WordlePanel extends JPanel {
    private final PlayerPanel playerPanel;
    private final OpponentPlayerPanel opponentPanel;

    public WordlePanel(ConnectionController connectionController) {
        this.setLayout(new GridLayout(1, 2, 50, 0));
        this.setBorder(new EmptyBorder(0, 50, 0, 50));

        this.playerPanel = new PlayerPanel(connectionController);
        add(this.playerPanel);

        setVisible(true);

        this.opponentPanel = new OpponentPlayerPanel(connectionController);
        add(this.opponentPanel);
    }

    public void updateWithGameState(GameStateData gameStateData) {
        if (gameStateData.currentRound() == null) return;
        this.playerPanel.updateWithGameState(gameStateData);
        this.opponentPanel.updateWithGameState(gameStateData);
    }

    public OpponentPlayerPanel getOpponentPanel() {
        return opponentPanel;
    }

    public PlayerPanel getPlayerPanel() {
        return this.playerPanel;
    }
}
