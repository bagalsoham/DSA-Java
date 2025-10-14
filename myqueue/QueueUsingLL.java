package myqueue;

import java.util.LinkedList;

public class QueueUsingLL {
    LinkedList<Integer> queue;
    QueueUsingLL(){
        this.queue = new LinkedList<>();


    }
    public boolean isEmpty(){
        return queue.isEmpty();

    }
    public void enqueue(int data){
        queue.addLast(data);
    }

    public  void  dequeue(){
        if(!isEmpty()){
            queue.removeFirst();
        }
    }
    public int getFront(){
        if(!isEmpty()){
            return queue.getFirst();
        }
        return -1;
    }
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        for(int i = 1; i <= 5; i++){
            q.enqueue(i * 10);
        }
        q.dequeue();
        q.dequeue();
        q.enqueue(8);
        while(!q.isEmpty()){
            System.out.println(q.getFront());
            q.dequeue();
        }
    }
}