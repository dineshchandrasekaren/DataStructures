import java.util.ArrayDeque;
import java.util.Queue;

public class QueueStack {
    Queue<Integer> queue2=new ArrayDeque<>();
    Queue<Integer> queue1=new ArrayDeque<>();
    int top;
    public void push(int value){
        queue1.add(value);
        top=value;
    }


        // O(n)
        public int pop() {
            if (isEmpty())
                throw new IllegalStateException();

            while (queue1.size() > 1) {
                top = queue1.remove();
                queue2.add(top);
            }

            swapQueues();

            return queue2.remove();
        }

        private void swapQueues() {
            var temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
    public boolean isEmpty(){
        return queue1.isEmpty()&&queue2.isEmpty();
    }
    @Override
    public String toString(){
        return queue2.toString()+queue1.toString();
    }
}
