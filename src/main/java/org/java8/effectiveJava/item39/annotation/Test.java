package org.java8.effectiveJava.item39.annotation;

public class Test {
    public static void main(String[] args) {
        int [] a ={1};
        Test t= new Test();
        t.inc(a);
        System.out.println(a[a.length-1]);

    }
    void inc(int[] i){
        i[i.length -1]++;
    }
}
