package core.round;

import lombok.Data;

@Data
public class DiskPlace {
    enum Direction {
        FORWARD {
            @Override
            boolean isEnd(int current) {
                return current < 0;
            }
        }, BACK {
            @Override
            boolean isEnd(int current) {
                return current > 100;
            }
        };

        abstract boolean isEnd(int current);
    }

    public boolean isEnd() {
        return current.isEnd(place);
    }

    int place = 0;
    Direction current = Direction.FORWARD;

    public void turnOver() {
        current = current.equals(Direction.FORWARD) ? Direction.BACK : Direction.FORWARD;
    }

}
