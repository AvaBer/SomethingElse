package somethingelse.model;

import static somethingelse.rules.MovementRule.isLegalMove;
import static somethingelse.rules.MovementRule.isNotWall;

public class Tile {

    public Tile() {
    }

    private TileObject tileObject;


    public TileObject getTileObject() {
        return tileObject;
    }

    public void setTileObject(TileObject tileObject) {
        this.tileObject = tileObject;
    }

    public void clearTileObject() {
        this.tileObject = null;
    }

    public void replaceTileObject(Tile tile) {
        if (isNotWall(this.tileObject)) {
            if (isLegalMove(this.tileObject, tile.tileObject)) {
                this.tileObject = tile.getTileObject();
                tile.clearTileObject();
            }
        }
    }

    public String drawTile() {
        if (tileObject == null)
            return " - ";
        else
            return tileObject.getSymbol();
    }
}
