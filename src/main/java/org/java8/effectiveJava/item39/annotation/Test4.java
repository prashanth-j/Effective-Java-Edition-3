package org.java8.effectiveJava.item39.annotation;

public class Test4 {
    class Inner {
        void test(){
            if(Test4.this.flag){

            }
        }
    }
    private boolean flag = true;
    public void sample(){
        System.out.println("samp");
    }
    Test4(){
        (new Inner()).test();
    }

    public static void main(String[] args) {
        new Test4();
    }
}
