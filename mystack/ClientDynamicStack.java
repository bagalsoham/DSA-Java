package mystack;
public class ClientDynamicStack {

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60); // This will trigger a resize
            stack.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}