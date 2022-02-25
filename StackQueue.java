package com.company;

public class StackQueue {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> queue=new Stack<>();



    public void add(int value){
        stack.push(value);

    }
    public int remove(){
        moveStack1ToStack2();
        return queue.pop();
    }
    public int peek(){
        moveStack1ToStack2();
        return queue.peek();
    }

    private void moveStack1ToStack2() {
        if(queue.isEmpty()&& stack.isEmpty()) throw  new IllegalStateException();
        if(queue.isEmpty())
            while(!stack.isEmpty())
             queue.push(stack.pop());
    }

    @Override
    public String toString() {
        return queue.toString();
    }
    public boolean isEmpty(){
        return queue.isEmpty() && stack.isEmpty();
    }
}
