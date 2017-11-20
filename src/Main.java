import somethingelse.GameBoard;
import somethingelse.model.Player;
import somethingelse.model.Tile;
import somethingelse.model.Wall;
import somethingelse.position.MoveAction;
import somethingelse.position.Position;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(10, 10);
        MoveAction move = new MoveAction();
        Position oldPos = new Position(1, 1);
        Position newPos = new Position(1, 2);
        gameBoard.drawGameBoard();
        gameBoard.getTileAt(oldPos).setTileObject(new Player());
        gameBoard.drawGameBoard();
        newPos = move.right(oldPos);
        gameBoard.getTileAt(newPos).replaceTileObject(gameBoard.getTileAt(oldPos));
        oldPos = newPos;
        newPos = move.down(oldPos);
        gameBoard.drawGameBoard();
        gameBoard.getTileAt(newPos).replaceTileObject(gameBoard.getTileAt(oldPos));
        gameBoard.drawGameBoard();
//        pos1 = move.left(pos1);
//        gameBoard.showPlayerPosition();

//        dump();
    }




    private static void dump() {
        Tile tile1 = new Tile();
        Tile tile2 = new Tile();
        Tile tile3 = new Tile();
        printTiles(tile1, tile2, tile3);

        tile1.setTileObject(new Player());
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
