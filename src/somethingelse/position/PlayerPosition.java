package somethingelse.position;

import somethingelse.GameBoard;
import somethingelse.model.ObjectKind;
import somethingelse.model.Tile;

public class PlayerPosition {
    private Position targetPosition;
    private Position currentPosition;

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public PlayerPosition(Position startPosition) {
        this.currentPosition = startPosition;
    }

    public void up(GameBoard board) {
        targetPosition = new Position(currentPosition.getY() - 1, currentPosition.getX());
        Tile currentTile = board.getTileAt(currentPosition);
        board.getTileAt(targetPosition).replaceTileObject(currentTile);
        if (board.getTileAt(targetPosition).getTileObject() != null &&
                board.getTileAt(targetPosition).getTileObject().getKind() == ObjectKind.Player) {
            currentPosition = targetPosition;
        }
    }

    public void down(GameBoard board) {
        targetPosition = new Position(currentPosition.getY() + 1, currentPosition.getX());
        Tile currentTile = board.getTileAt(currentPosition);
        board.getTileAt(targetPosition).replaceTileObject(currentTile);
        if (board.getTileAt(targetPosition).getTileObject() != null &&
                board.getTileAt(targetPosition).getTileObject().getKind() == ObjectKind.Player) {
            currentPosition = targetPosition;
        }
    }

    public void left(GameBoard board) {
        targetPosition = new Position(currentPosition.getY(), currentPosition.getX() - 1);
        Tile currentTile = board.getTileAt(currentPosition);
        board.getTileAt(targetPosition).replaceTileObject(currentTile);
        if (board.getTileAt(targetPosition).getTileObject() != null &&
                board.getTileAt(targetPosition).getTileObject().getKind() == ObjectKind.Player) {
            currentPosition = targetPosition;
        }
    }

    public void right(GameBoard board) {
        targetPosition = new Position(currentPosition.getY(), currentPosition.getX() + 1);
        Tile currentTile = board.getTileAt(currentPosition);
        board.getTileAt(targetPosition).replaceTileObject(currentTile);
        if (board.getTileAt(targetPosition).getTileObject() != null &&
                board.getTileAt(targetPosition).getTileObject().getKind() == ObjectKind.Player) {
            currentPosition = targetPosition;
        }
    }

}
