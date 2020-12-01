package core.round;

import core.player.Player;
import core.team.PickBest;
import core.team.PointSquad;
import utils.DoubleStream;
import utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OpponentConnectionMap {
    private final Map<Player, Player> oppoMap = new HashMap<>();

    public OpponentConnectionMap(PointSquad attackSquad, PointSquad defenceSquad) {
        ArrayList<Player> attackPlayers = new ArrayList<>(attackSquad.getPlayers());
        ArrayList<Player> defencePlayers = new ArrayList<>(defenceSquad.getPlayers());

        if (attackPlayers.size() != defencePlayers.size()) {
            throw new IllegalArgumentException("NotEqualsTeams");
        }

        attackPlayers.sort(PickBest::comparePlayers);
        defencePlayers.sort(PickBest::comparePlayers);

        DoubleStream.of(attackPlayers, defencePlayers).forEach(this::putBiDirectional);
    }

    private void putBiDirectional(Pair<Player, Player> pair) {
        oppoMap.put(pair.getFirst(), pair.getSecond());
        oppoMap.put(pair.getSecond(), pair.getFirst());
    }

    public Player getOpponent(Player player) {
        return oppoMap.get(player);
    }

}
