package org.java8.effectiveJava.item39.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();
        if (cat.getClass().isAnnotationPresent(CustomAnnotation.class)) {
            System.out.println("Yes customation annotation is present");
        } else {
            System.out.println("Nope");
        }
        /**
         * Scan each method in the given class Cat and when method is found with annotation RunImmediately then executes
         */

        for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < runImmediately.times(); i++) {
                    method.invoke(cat);
                }
            }
        }
    }
}
