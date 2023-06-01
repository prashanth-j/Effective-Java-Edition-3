package org.java8.effectiveJava.item1;

public class Point {

    double x, y;

    enum Angle {
        rad, deg;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double rho, double phi, int dummy) {
        this.x = rho * Math.cos(phi);
        this.y = rho * Math.sin(phi);
    }

    public Point(double rho, double phi, Angle unit) {

        switch (unit) {
            case rad: {
                this.x = rho * Math.cos(phi);
                this.y = rho * Math.sin(phi);
            }
            case deg: {
                double phi1 = phi * Math.PI / 180.0;
                this.x = rho * Math.cos(phi1);
                this.y = rho * Math.sin(phi1);
            }
        }
    }

    public static Point ofCartesian(double rho, double phi) {
        return new Point(rho, phi);
    }

    public static Point ofPolar(double rho, double phi, Angle angle) {
        return new Point(rho, phi, angle);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        var p1 = new Point(10, 20);
        System.out.println(p1);

        var p2 = new Point(10, Math.atan2(4.0, 3.0), -1);
        System.out.println(p2);

        var p3 = new Point(10, Math.atan2(4.0, 3.0), Angle.deg);
        System.out.println(p3);

    }
}
