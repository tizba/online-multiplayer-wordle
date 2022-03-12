package fr.baptiste_masoud.multiplayer_wordle.messages.game_state;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

public record GameStateData(boolean running,
                            @Nullable RoundData currentRound)
        implements Serializable {

}
