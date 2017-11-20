package somethingelse.rules;

import somethingelse.model.ObjectKind;
import somethingelse.model.Tile;
import somethingelse.model.TileObject;
import somethingelse.position.Position;

public class MovementRule {

    public static boolean isLegalMove(TileObject current, TileObject target) {
        if (current == null && target != null)
            return true;
        if (current != null && target != null) {
            if (current.getKind() == ObjectKind.Wall && target.getKind() == ObjectKind.Player)
                return false;
        }
        return true;
    }

    public static boolean isNotWall(TileObject tileObject) {
        return tileObject == null || tileObject.getKind() != ObjectKind.Wall;
    }

    public static boolean isMoveWithinBounds(Tile[][] board, Position current, Position target) {
        if (target.getY() <= 0 || target.getX() <= 0)
            return false;
        if (target.getY() >= board.length -1 || target.getX() >= board[0].length -1)
            return false;
        return true;
    }
}
