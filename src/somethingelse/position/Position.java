package somethingelse.position;

public class Position {
    private int y;
    private int x;

    public Position(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    public String getPosition() {
        return String.format("Y: %d, X: %d", getY(), getX());
    }
}
