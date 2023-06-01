package org.java8.effectiveJava.item2;

public class Test {
    public static void main(String[] args) {
        var p1 = new PointBuilder().x(2.1).y(3.5).build();
        System.out.println(p1);
    }
}
