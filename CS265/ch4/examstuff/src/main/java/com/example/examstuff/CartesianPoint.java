package com.example.examstuff;

public abstract class CartesianPoint implements Cloneable, Comparable<CartesianPoint> {

    private int x, y;

    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CartesianPoint() {
        this(1, 1);
    }

    public int whereX() {
        return x;
    }

    public void setX(int v) {
        this.x = v;
    }

    public int whereY() {
        return y;
    }

    public void setY(int u) {
        this.y = u;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    @Override
    public int compareTo(CartesianPoint o) {
        double d1 = Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2));
        double d2 = Math.sqrt(Math.pow((o.whereX()), 2) + Math.pow((o.whereY()), 2));
        return Double.compare(d1, d2);
    }

    @Override
    public CartesianPoint clone() {
        try {
            return (CartesianPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
