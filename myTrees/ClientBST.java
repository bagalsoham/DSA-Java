package myTrees;

public class ClientBST {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        BinarySearchTree bst = new BinarySearchTree(arr);
        
        System.out.println("Initial BST:");
        bst.display();
        
        System.out.println("\nSearch Results:");
        System.out.println("Find 30: " + bst.find(30));
        System.out.println("Find 90: " + bst.find(90));
        System.out.println("Find 10: " + bst.find(10));
        
        System.out.println("\nMaximum value: " + bst.max());
        
        System.out.println("\nAdding 35 twice...");
        bst.add(35);
        bst.add(35);
        System.out.println("BST after adding 35:");
        bst.display();
        
        System.out.println("\nRemoving 35...");
        bst.remove(35);
        System.out.println("After removing 35:");
        bst.display();
        
        System.out.println("\nRemoving root node (50)...");
        bst.remove(50);
        System.out.println("After removing root:");
        bst.display();
    }
}