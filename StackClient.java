import mystack.*;; // import the package

public class StackClient {
    public static void main(String[] args) {
        try {
            Stack s = new Stack(3);
            s.push(10);
            s.push(20);
            s.push(30);
            s.display();  // 30 20 10
            System.out.println(s.pop()); // 30
            s.display(); // 20 10
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
