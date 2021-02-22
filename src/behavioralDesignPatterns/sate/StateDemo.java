package behavioralDesignPatterns.sate;

import behavioralDesignPatterns.sate.ui.Player;
import behavioralDesignPatterns.sate.ui.UI;

public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
