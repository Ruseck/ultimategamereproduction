package core.round;

import core.player.Player;
import core.team.PointSquad;

public class Point {
    PointSquad attackSquad;
    PointSquad defenceSquad;

    OpponentConnectionMap opponentConnectionMap;

    public void run() {
        while (notEnd()) {
            throwDiskByHandler();
        }

    }

    private boolean notEnd() {

    }

    private void throwDiskByHandler() {

    }


    private void calculate() {
        Player handler = attackSquad.getHandler();
        double pickPlayerQuality = handler.getExpirience().getValue();

        double throwQuality = handler.getAThrow().getValue();

        double catchQuality = handler.getACatch().getValue();

        double stamina = handler.getStamina().getValue();
    }

}
