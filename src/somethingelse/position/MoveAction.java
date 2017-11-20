package somethingelse.position;

public class MoveAction {

    public MoveAction() {
    }

    public Position up(Position position) {
        return new Position(position.getY() - 1, position.getX());
    }

    public Position down(Position position) {
        return new Position(position.getY() + 1, position.getX());
    }

    public Position left(Position position) {
        return new Position(position.getY(), position.getX() - 1);
    }

    public Position right(Position position) {
        return new Position(position.getY(), position.getX() + 1);
    }

}
