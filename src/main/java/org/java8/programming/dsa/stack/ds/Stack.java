package org.java8.programming.dsa.stack.ds;

public class Stack {
    private int[] arr;
    private int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created successfully");
    }

    public boolean isEmpty() {
        if (topOfStack == -1) return true;
        return false;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("inserted successfully");
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int topStack = arr[topOfStack];
        topOfStack--;
        return topStack;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[topOfStack];
    }

    public void delete() {
        arr = null;
        topOfStack = -1;
        System.out.println("stack deleted succesfully");
    }
}
