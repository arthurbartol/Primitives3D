package Primitives;

public class Vector3 {
    private double x, y, z;

    public Vector3() {}

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) { this.x = x; }
    public double getX() { return this.x; }

    public void setY(double y) { this.y = y; }
    public double getY() { return this.y; }

    public void setZ(double z) { this.z = z; }
    public double getZ() { return this.z; }

    public Vector3 sumVec(Vector3 v1, Vector3 v2) {
        return new Vector3(
            v1.x + v2.x,
            v1.y + v2.y,
            v1.z + v2.z
        );
    }

    public Vector3 subVec(Vector3 v1, Vector3 v2) {
        return new Vector3(
            v1.x - v2.x,
            v1.y - v2.y,
            v1.z - v2.z
        );
    }

    public Vector3 multVec(Vector3 v1, Vector3 v2) {
        return new Vector3(
            v1.x * v2.x,
            v1.y * v2.y,
            v1.z * v2.z
        );
    }

    public Vector3 multVecByScalar(Vector3 v, double scalar) {
        return new Vector3(
            v.x * scalar,
            v.y * scalar,
            v.z * scalar
        );
    }

    public Vector3 divVec(Vector3 v1, Vector3 v2) {
        return new Vector3(
            v1.x / v2.x,
            v1.y / v2.y,
            v1.z / v2.z
        );
    }

    public Vector3 divVecByScalar(Vector3 v, double scalar) {
        return new Vector3(
            v.x / scalar,
            v.y / scalar,
            v.z / scalar
        );
    }

    public double magnitude(Vector3 v) {
        return Math.sqrt(v.x*v.x + v.y*v.y + v.z*v.z);
    }

    public double dot(Vector3 v1, Vector3 v2) {
        return v1.x*v2.x + v1.y*v2.y + v1.z*v2.z;
    }

    public Vector3 cross(Vector3 v1, Vector3 v2) {
        return new Vector3(
            v1.y * v2.z - v1.z * v2.y,
            v1.z * v2.x - v1.x * v2.z,
            v1.x * v2.y - v1.y * v2.x
        );
    }
}
