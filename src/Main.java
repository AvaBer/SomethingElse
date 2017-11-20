import somethingelse.GameBoard;
import somethingelse.model.Player;
import somethingelse.model.Tile;
import somethingelse.model.Wall;
import somethingelse.position.Position;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(10, 10);
        gameBoard.drawGameBoard();
        gameBoard.showPlayerPosition();
        gameBoard.getPlayer().move().up();

//        dump();
    }




    private static void dump() {
        Tile tile1 = new Tile();
        Tile tile2 = new Tile();
        Tile tile3 = new Tile();
        printTiles(tile1, tile2, tile3);

        tile1.setTileObject(new Player(new Position(1,2)));
        tile3.setTileObject(new Wall());
        printTiles(tile1, tile2, tile3);

        tile2.replaceTileObject(tile1);
        tile3.replaceTileObject(tile1);
        printTiles(tile1, tile2, tile3);
        tile3.replaceTileObject(tile1);
        printTiles(tile1, tile2, tile3);

    }
    private static void printTiles(Tile ... tile ) {
        for (Tile tile1 : tile) {
            System.out.print(tile1.drawTile());
        }
        System.out.println();
    }
}
