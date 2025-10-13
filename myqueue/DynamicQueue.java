package myqueue;

public class DynamicQueue extends Queue {
    @Override
    public void enqueue(int item ) throws Exception {
        if (isFull()) {
            int[] newQueue = new int [data.length * 2];

            // copy the elements from old array to new array
            for(int i =0; i < size(); i++) {
                // circular manner of copying elements to new array
                newQueue[i] = data[(front + i) % data.length];
                
            }
            // update the reference of old array to new array
            data = newQueue;
            // reset front
            front = 0;
        }
        super.enqueue(item);
    }
}
