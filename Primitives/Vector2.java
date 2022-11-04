package Primitives;

public class Vector2 {
    private double x, y;

    public Vector2() {}

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public double getX() { return this.x; }

    public void setY(double y) { this.y = y; }
    public double getY() { return this.y; }
}
