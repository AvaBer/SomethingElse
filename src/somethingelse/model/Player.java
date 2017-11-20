package somethingelse.model;

import somethingelse.position.Position;

public class Player implements TileObject {
    private Position playerPosition;

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
}
