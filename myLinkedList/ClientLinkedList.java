package myLinkedList;

public class ClientLinkedList {
    public static void main(String[] args) {
        try {
            // Create linked list
            LinkedList list = new LinkedList();

            System.out.println("Displaying empty list:");
            list.display();  // null

            // Add elements at the end
            list.addLast(10);
            list.addLast(20);
            System.out.println("\nAfter addLast(10) and addLast(20):");
            list.display();  // 10 -> 20 -> null

            // Add element at the beginning
            list.addFirst(5);
            System.out.println("\nAfter addFirst(5):");
            list.display();  // 5 -> 10 -> 20 -> null

            // Get first element
            System.out.println("\nFirst element: " + list.getFirst());  // 5

            // Get last element
            System.out.println("Last element: " + list.getLast());      // 20

            // Get element at index 1
            System.out.println("Element at index 1: " + list.getAt(1)); // 10
            // Remove first element
            System.out.println("Removed first element: " + list.removeFirst());  // 5
            list.display();  // 10 -> 20 -> null

            // Remove last element
            System.out.println("Removed last element: " + list.removeLast());  // 20
            list.display();  // 10 -> null
            
            // Remove element at index 0
            System.out.println("Removed element at index 0: " + list.removeAt(0));  // 10
            list.display();  // null

            //reverse the list  
            list.addLast(30);
            list.addLast(40);
            list.addLast(50);
            list.addLast(60);
            list.addLast(70);
            list.addLast(80);
            
            System.out.println("\nAfter addLast(30) and addLast(40):");
            list.display();  // 30 -> 40 -> null
            list.reverseData();
            System.out.println("\nAfter reverseData():");
            list.display();  // 40 -> 30 -> null

            list.reversePointers();
            System.out.println("\nAfter reversePointers():");
            list.display();  // 30 -> 40 -> null    

            System.out.println("Middle element: " + list.mid());  // 40

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
