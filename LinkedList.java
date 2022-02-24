package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    public int size() {
        return length;
    }

    private int length=0;

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    //addLast
    public void addLast(int value) {
        var newNode = new Node(value);
        if (isEmpty()) first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
        this.length++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    //addFirst
    public void addFirst(int value) {
        var newNode = new Node(value);
        if (isEmpty()) first = last = newNode;
        else {
            newNode.next = first;
            first = newNode;
        }
        this.length++;
    }

    public int[] toArray() {
        int[] array = new int[this.length];
        var currentNode = this.first;
        for(int i=0;currentNode != null;i++) {
            array[i]=currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public boolean isContain(int value) {
        return this.indexOf(value)!=-1;
    }

    public int indexOf(int value){
        int count=0;
        var currentNode = this.first;
        while (currentNode != null) {
            if (currentNode.value==value) return count;

                    count++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if(first == last) first = last =null;
        else{
            last = getPrevious(last);
            last.next = null;
        }
        this.length--;
    }
    //deleteLast



    private Node getPrevious(Node node) {

        var currentNode = first;
        while (currentNode.next != null) {
            if (currentNode.next == node) return currentNode;
             else currentNode = currentNode.next;
        }
        return null;
    }

    //deleteFirst
    public void deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if(first == last) first = last =null;
        else{
            var second = first.next;
            first.next=null;
            first = second;
        }
        this.length--;
        }
        public void reverse(){
        var prev=first;


        var curr=prev.next;
        while(curr != null){
            var n =curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;

        }
            last=first;
            last.next=null;
        first=prev;


        }
        public int KnthNode(int nthNode){
    if(isEmpty()) throw new IllegalStateException();
         var a=first;
         var b=first;
            for (int i = 0; i < nthNode - 1; i++) {
                b = b.next;
                if(b==null) throw new IllegalArgumentException();
            }
            while(b!=last){
                a=a.next;
                b=b.next;
            }
            return a.value;
    }
    }


