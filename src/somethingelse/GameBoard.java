package somethingelse;

import somethingelse.model.Player;
import somethingelse.model.Tile;
import somethingelse.model.TileObject;
import somethingelse.model.Wall;
import somethingelse.position.Position;

public class GameBoard {
    private Tile[][] board;
    private Player player;

    public GameBoard(int y, int x) {
        setupBoard(y, x);
    }

    private void setupBoard(int y, int x) {
        board = new Tile[y][x];
        Tile tile;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                tile = new Tile();
                if ((i == 0 || i == board.length - 1) || (j == 0 || j == board[i].length -1))
                    tile.setTileObject(new Wall());
                if (i == 1 && j == 1) {
                    player = new Player(new Position(i, j));
                    tile.setTileObject(player);
                }
                board[i][j] = tile;
            }
        }
    }

    public Tile[][] getBoard() {
        return board;
    }

    public Player getPlayer() {
        return player;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }


    public void drawGameBoard() {
        for (Tile[] tileRow : board) {
            for (Tile tile : tileRow) {
                System.out.print(tile.drawTile());
            }
            System.out.println();
        }
    }

    public void showPlayerPosition() {
        System.out.println(getPlayer().getPlayerPosition().getPosition());
    }


}
