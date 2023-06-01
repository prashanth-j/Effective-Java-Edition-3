package org.java8.effectiveJava.item39.annotation;

@CustomAnnotation
public class Cat {

    @SuppressWarnings("unused")
    private int a;
    @SuppressWarnings("unused")
    private String meow;

    @SuppressWarnings("unused")
    public void meow() {
        System.out.println("Cat says meow");
    }

    @RunImmediately(times = 3)
    @SuppressWarnings("unused")
    public void eat() {
        System.out.println("Cat eats meat");
    }
}
