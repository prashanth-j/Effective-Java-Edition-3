package org.java8.effectiveJava.item2;

public class Point {

    enum Angle {
        rad,deg;
    }
    double x;
    double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private Point(double rho, double phi, Angle angle) {
        double phiRad;
        if(angle.equals("deg")){
            phiRad = phi * Math.PI/180;
        }
        this.x = x;
        this.y = y;
    }

}
