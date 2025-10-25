package myqueue;

public class ReverseQueue {
    public static void reverseQueue(DynamicQueue queue)  throws Exception {
        if(queue.isEmpty()){
            return;
        } 
        int element = queue.dequeue();
        reverseQueue(queue);
        queue.enqueue(element);
    }
}
