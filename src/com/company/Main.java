package com.company;

public class Main {

    public static void main(String[] args) {
        myQueue queue = new myQueue();

        queue.enqueue(10);
        queue.deque();

        queue.enqueue(20);
        queue.enqueue(300);
        queue.deque();
        queue.deque();

        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();

        queue.print();
    }
}
