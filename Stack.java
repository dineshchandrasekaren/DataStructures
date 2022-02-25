import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    T[] stack= (T[]) new Object[5];
    int length=0;

    public void push(T value){
        if(length==5) throw new StackOverflowError();
        stack[length]=value;
        length++;
    }
    public T pop(){
    if(isEmpty()) throw new EmptyStackException();
        return stack[--length];
    }
    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return stack[length-1];
    }
    public boolean isEmpty(){
        return length==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack,0,length));
    }
}
