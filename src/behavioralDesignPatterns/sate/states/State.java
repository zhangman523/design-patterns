package behavioralDesignPatterns.sate.states;

import behavioralDesignPatterns.sate.ui.Player;

/**
 * Common interface for all states.
 */
public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
