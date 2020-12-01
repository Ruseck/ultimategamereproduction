package core.team;

import core.player.Player;

import java.util.List;

public class PickBest {
    public static Player player(List<Player> playerList){
        return playerList.stream().max(PickBest::comparePlayers).orElseThrow();
    }

    public static int comparePlayers(Player first, Player second) {
        return 0;
    }

}
