package somethingelse.position;

public class MoveAction {

    private Position position;

    public MoveAction() {
    }

    public MoveAction(Position position) {
        this.position = position;
    }

    public Position up() {
        return new Position(position.getY() - 1, position.getX());
    }

    public Position down() {
        return new Position(position.getY() + 1, position.getX());
    }

    public Position left() {
        return new Position(position.getY(), position.getX() - 1);
    }

    public Position right() {
        return new Position(position.getY(), position.getX() - 1);
    }

}
