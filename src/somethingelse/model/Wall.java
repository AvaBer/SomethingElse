package somethingelse.model;

public class Wall implements TileObject {
    @Override
    public ObjectKind getKind() {
        return ObjectKind.Wall;
    }

    @Override
    public String getSymbol() {
        return "{#}";
    }
}
