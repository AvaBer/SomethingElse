package somethingelse;

import somethingelse.model.Player;
import somethingelse.position.MoveAction;

public class GameRoot {
    private GameBoard gameBoard = new GameBoard(10, 10);
    private MoveAction moveAction = new MoveAction();
    private Player player = gameBoard.getPlayer();


}
