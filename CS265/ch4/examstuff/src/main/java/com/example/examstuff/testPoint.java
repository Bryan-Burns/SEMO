package com.example.examstuff;

public class testPoint {

    public static void main(String[] args) {

        CartesianPoint p1 = new CartesianPoint(2, 2) {
            @Override
            public int whereX() {
                return super.whereX();
            }

            @Override
            public void setX(int v) {
                super.setX(v);
            }

            @Override
            public int whereY() {
                return super.whereY();
            }

            @Override
            public void setY(int u) {
                super.setY(u);
            }

            @Override
            public int compareTo(CartesianPoint o) {
                return super.compareTo(o);
            }

            @Override
            public CartesianPoint clone() {
                return super.clone();
            }
        };
        CartesianPoint p2 = new CartesianPoint(3, 3) {
            @Override
            public int whereX() {
                return super.whereX();
            }

            @Override
            public void setX(int v) {
                super.setX(v);
            }

            @Override
            public int whereY() {
                return super.whereY();
            }

            @Override
            public void setY(int u) {
                super.setY(u);
            }

            @Override
            public int compareTo(CartesianPoint o) {
                return super.compareTo(o);
            }

            @Override
            public CartesianPoint clone() {
                return super.clone();
            }
        };

        CartesianPoint p3;
        if (p1.compareTo(p2) == 1) {
            p3 = p1.clone();
        }
        else {
            p3 = p2.clone();
        }

        p3.setX(4);
        p3.setY(4);
        System.out.println(p3.toString());


    }
}
