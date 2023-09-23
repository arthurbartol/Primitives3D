package primitives;

import types.Vector3;

public class Cube {
    public Vector3<Float> origin;
    public float length;

    public Cube(Vector3<Float> origin, float length) {
        this.origin = origin;
        this.length = length;
    }
}
