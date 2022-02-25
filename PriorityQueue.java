
import java.util.Arrays;

public class PriorityQueue {
    int[] queue=new int[10];
    int count =0;
    public void push(int value){
        if (isFull()) throw new IllegalStateException();
        int i = ShiftingToInsert(value);
        queue[i]=value;
        count++;
        }

    private int ShiftingToInsert(int value) {
        int i;
        for(i=count-1;i>=0;i--){
            if(queue[i]> value)
                queue[i+1]=queue[i];
            else break;
            }
        return i+1;
    }


    public int pop(){
        if(isEmpty()) throw new IllegalStateException();
        return queue[--count];
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return queue[count-1];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count== queue.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(queue,0,count));
    }
}
