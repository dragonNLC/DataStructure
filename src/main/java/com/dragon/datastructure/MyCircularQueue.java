package com.dragon.datastructure;

public class MyCircularQueue {

    private int[] items;
    private int front;
    private int tail;

    private int capacity;
    private int curSize;

    public MyCircularQueue(int capacity) {
        if (capacity < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.items = new int[capacity];
        this.front = -1;
        this.tail = -1;
        this.capacity = capacity;
    }

    public int getFront() {
        return front;
    }

    public int getTail() {
        return tail;
    }

    //入队
    public boolean enQueue(int data) {
        if (isFull()) {
            return false;
        }
        if (front == capacity - 1) {
            front = 0;
            items[front] = data;
        } else {
            items[++front] = data;
        }
        curSize++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (tail == 0) {
            tail = capacity - 1;
            int d = items[tail];
            tail--;
            return d;
        } else {

        }
    }

    public boolean isFull() {
        return curSize == capacity;
    }

    public boolean isEmpty() {
        return curSize == 0;
    }

}
