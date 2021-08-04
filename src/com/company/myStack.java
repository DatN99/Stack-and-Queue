package com.company;

/**
 * This class holds the stack.
 * All operations should be O(1) following the stack LIFO principle
 *
 */

public class myStack {

    int array[] = new int[0];

    int size = 0;

    int capacity = 1;


    public void add(int data){

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

    public void pop() {

        if (size == 0){
            return;
        }
        int i = array.length-1;

        while (array[i] == 0){
            i--;
        }

        array[i] = 0;
    }


    public void peek_front(){
        System.out.println(array[0]);
    }

    public void peek_back(){

        if (size == 0){
            return;
        }
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
