package mystack;

public class DynamicStack extends Stack  {
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            // create a new array with double the size
            int[] newStack = new int[data.length * 2];
            // copy the elements from old array to new array
            for (int i = 0; i <= tos; i++) {
                newStack[i] = data[i];
            }
            // point the data to new array
            data = newStack;
        }

        // Always push the item (whether resized or not)
        super.push(item);
    }
}
