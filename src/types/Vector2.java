package types;

public class Vector2<TYPE> {
    private TYPE x;
    private TYPE y;

    public Vector2() {
        // nothing
    }

    public Vector2(TYPE t) {
        this.x = t;
        this.y = t;
    }

    public Vector2(TYPE x, TYPE y) {
        this.x = x;
        this.y = y;
    }

    public void setX(TYPE x) { this.x = x; }
    public TYPE x() { return x; }

    public void setY(TYPE y) { this.y = y; }
    public TYPE y() { return y; }
}
