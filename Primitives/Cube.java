package Primitives;

public class Cube {
    private Vector3 localOrigin;
    private double sideLenght;
    
    public Cube(Vector3 localOrigin) {
        this.localOrigin = localOrigin;
    }

    public Cube(Vector3 localOrigin, double sideLenght) {
        this.localOrigin = localOrigin;
        this.sideLenght = sideLenght;
    }

    public void setLocalOrigin(Vector3 localOrigin) { this.localOrigin = localOrigin; }
    public Vector3 getLocalOrigin() { return this.localOrigin; }

    public void setSideLenght(double sideLenght) { this.sideLenght = sideLenght; }
    public double getSideLenght() { return this.sideLenght; }
}
