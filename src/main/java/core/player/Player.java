package core.player;

import core.player.qualities.*;
import lombok.Data;

@Data
public class Player {
    Expirience expirience;
    Speed speed;
    Throw aThrow;
    Catch aCatch;
    Stamina stamina;
}
