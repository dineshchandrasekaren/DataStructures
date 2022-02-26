package com.company;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListQueue {
   private LinkedList<Integer> queue=new LinkedList<>();

    public void enqueue(int value){
        queue.push(value);
    }
    public int dequeue(){
        if(queue.isEmpty()) throw new IllegalStateException();
        return queue.removeLast();
    }
    public int peek(){
        if(queue.isEmpty()) throw new IllegalStateException();
        return queue.getLast();
    }


    public boolean isEmpty() {

        return queue.isEmpty();
    }


    @Override
    public String toString() {
        return queue.toString();
    }
}
