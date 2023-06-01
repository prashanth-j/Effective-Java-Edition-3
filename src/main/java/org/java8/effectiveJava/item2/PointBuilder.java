package org.java8.effectiveJava.item2;

public class PointBuilder {

    double x, y;

    public PointBuilder() {
    }

    public PointBuilder x(double x) {
        this.x = x;
        return this;
    }

    public PointBuilder y(double y) {
        this.y = y;
        return this;
    }

    public Point build() {
        return new Point(x, y);
    }
}
