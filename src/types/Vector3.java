package types;

public class Vector3<TYPE> {
    private TYPE x;
    private TYPE y;
    private TYPE z;

    public Vector3() {
        // nothing
    }

    public Vector3(TYPE t) {
        this.x = t;
        this.y = t;
        this.z = t;
    }

    public Vector3(TYPE x, TYPE y, TYPE z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(TYPE x) { this.x = x; }
    public TYPE x() { return x; }

    public void setY(TYPE y) { this.y = y; }
    public TYPE y() { return y; }

    public void setZ(TYPE z) { this.z = z; }
    public TYPE z() { return z; }
}
