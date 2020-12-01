package core.team;

import core.player.Player;
import lombok.Value;

import java.util.List;

@Value
public class PointSquad {
    List<Player> players;
    Player handler;
}
