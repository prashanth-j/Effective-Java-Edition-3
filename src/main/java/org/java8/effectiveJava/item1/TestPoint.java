package org.java8.effectiveJava.item1;

public class TestPoint {
    public static void main(String[] args) {
        var p1 = Point.ofCartesian(2.0, 4.0);
        System.out.println(p1);
        var p2 = Point.ofPolar(2.0, 4.0, Point.Angle.rad);
        System.out.println(p2);
    }
}
