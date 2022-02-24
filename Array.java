package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers=new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.removeAt(0);
//        numbers.indexOf(1);
//        System.out.println("the largest number is: "+ numbers.max());
//        System.out.println(numbers.intersect(new int[]{2, 4}));
//        System.out.println(numbers.reverse());
//        numbers.insertAt(2,2);
        numbers.print();

    }


}
class Array{
    private int count=0;
    private int[] items;
    Array(int length) {
        items=new int[length];
    }

    public void insert(int item){
        if(items.length==count){
            int[] newArray=new int[count*2];
            int k=0;
            for (int i :items) newArray[k++] = i;
            items=newArray;
        }
        items[count++]=item;
    }

    public void removeAt(int index){
        if (index<0 || index>=count) throw new Error("Index was not found");

           for (int i=index;i<count;i++)
               items[i]=items[i+1];

           count--;

        }


    public void indexOf(int index){
        if (index<items.length) System.out.println("Index of "+index+" was: "+items[index]);
        else throw new Error("Index out of bound");
    }

    public int max(){
        int big=0;
        for (int item :
                items) {
         if(item>big){
             big=item;
         }
        }
        return big;
    }

    public String intersect(int[] array){
        int i=0;
        int[] common=new int[array.length];
        for (int item : items)
            for (int arr : array)
                if (item == arr) common[i++] = item;

        return "Common Element: "+ Arrays.toString(common);
    }

    public String reverse(){

        int[] back=new int[items.length];
        int j=0;
        for (int i=items.length-1;i>=0;i--){
            back[j]=items[i];
            j++;
        }
        return "Reversed array"+Arrays.toString(back);
    }

    public void print(){
        for (int i=0;i<=count;i++) {
            System.out.println(items[i]);
        }
    }

    public void insertAt(int item,int index){
        if (index<items.length){
            int[] insertedArray=new int[items.length+1];
            for (int i=0;i<items.length;i++) {
                if(index==i){
                    insertedArray[i]=item;
                    insertedArray[i+1]=items[i];
                }else if(i>index) insertedArray[i + 1] = items[i];
                else insertedArray[i] = items[i];
            }
            items=insertedArray;
        }else throw new Error("Given index was not Bound");
    }

}
