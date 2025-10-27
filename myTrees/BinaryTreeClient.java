package myTrees;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(); // build the tree interactively
        bt.display();                     // show structure
        System.out.println("Height of the tree is: " + bt.height());
        System.out.print("Preorder traversal: ");
        bt.preOrder();
        System.out.println();
        System.out.print("Inorder traversal: ");
        bt.inOrder();
        System.out.println();
        System.out.print("Postorder traversal: ");
        bt.postOrder();
        System.out.println();
        System.out.print("Level order traversal: ");
        bt.levelOrder();

        //is BT a BST
        //approach 1 : using inorder traversal and checking sorted order
        System.out.println();
        System.out.println("Is Binary Tree a BST ? " + bt.isBST());
        System.out.println("Is Binary Tree a BST (Inorder) ? " + bt.isBSTUsingInorder());
        System.out.println();

    }
}
