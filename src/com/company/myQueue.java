package com.company;

/**
 * This class implements a basic queue
 *
 * All operations are O(1) following the FIFO principle
 */

public class myQueue {

    int array[] = new int[0];

    int size = 0;

    int capacity = 1;


    public void enqueue(int data){

        //copy stack into new stack with larger double capacity
        if (isFull()){
            capacity = capacity*2;
            int newStack[] = new int[capacity];
            for (int i = 0; i < array.length; i++){
                newStack[i] = array[i];
            }
            array = newStack;
        }

        array[size] = data;

        size ++;

    }

    public void deque() {

        int newQueue[] = new int[capacity];

        for (int i = 0; i < array.length-1; i++){
            newQueue[i] = array[i+1];
        }

        newQueue[size-1] = 0;

        array = newQueue;

        size--;

    }


    public void peek_front(){
        System.out.println(array[0]);
    }

    public void peek_back(){
        int i = array.length-1;

        while (array[i] == 0){
            i--;
        }

        System.out.println(array[i]);
    }

    public boolean isFull(){

        //copy stack
        if (size == capacity){
            return true;
        }

        //initialization
        else if (size == 0){
            return true;
        }

        return false;
    }

    public void print(){

        String string = "";

        for (int i = 0; i < array.length; i++){
            string += array[i] + ", ";
        }

        System.out.println(string);
    }
}
