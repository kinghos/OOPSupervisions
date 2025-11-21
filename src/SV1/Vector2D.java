package SV1;

public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.getX(), y + v.getY());
    }

    public float vectorProduct(Vector2D v) {
        return x * v.getX() + y * v.getY();
    }

    public double magnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public Vector2D normalised() {
        double n = magnitude();
        return new Vector2D((float) (x/n), (float) (y/n));
    }

}
