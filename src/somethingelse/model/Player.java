package somethingelse.model;

import somethingelse.position.MoveAction;
import somethingelse.position.Position;

public class Player implements TileObject {
    private Position playerPosition;
    private MoveAction moveAction;
    public Player(Position playerPosition) {
        setPlayerPosition(playerPosition);
        moveAction = new MoveAction(playerPosition);
    }
    @Override
    public ObjectKind getKind() {
        return ObjectKind.Player;
    }

    @Override
    public String getSymbol() {
        return " @ ";
    }

    public void setPlayerPosition(Position playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public MoveAction move() {
        return moveAction;
    }
}
