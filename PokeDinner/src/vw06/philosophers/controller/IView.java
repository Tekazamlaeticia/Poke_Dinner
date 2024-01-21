package vw06.philosophers.controller;

import vw06.philosophers.model.PhilosopherStatus;

public interface IView {
    /**
     * Draws the current game state with the given state.
     *
     * @param forks        availability of the five forks (true=fork on table; false=otherwise)
     * @param philosophers state of the five philosophers
     */
    void drawGameState(boolean[] forks, PhilosopherStatus[] philosophers);
}
