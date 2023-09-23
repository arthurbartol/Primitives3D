package primitives;

import types.Vector2;

public class Line {
    private Vector2<Float> pos;

    public Line(Vector2<Float> pos) {
        this.pos = pos;
    }

    public Line(float x, float y) {
        this.pos.setX(x);
        this.pos.setY(y);
    }

    public Vector2<Float> pos() { return pos; }
}
