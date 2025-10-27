package myTrees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class genericTrees {
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }

    }
    private Node root;  
    private int size;
    
    genericTrees(){
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s , null , 0);
    }
    // Function to take input for the tree recursively
    private Node takeInput(Scanner s , Node parent , int ithChild){//parameters : scanner object , parent node , ith child of parent
        if(root == null){
            System.out.println("Enter data for root node : ");
        }
        else{
            System.out.println( "Enter the data for the " + ithChild + " child of " + parent.data + " : ");
            
        }
        int nodeData = s.nextInt();
        Node node = new Node(nodeData);
        this.size++;
        System.out.println("Enter number of children for " + nodeData);
        int numChildren = s.nextInt();
        //will be executed according to the value of numChildren
        for(int i = 0 ; i < numChildren ; i++){
            Node child = takeInput(s , node , i);
            node.children.add(child);
        }
        return  node;
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str = node.data + " => ";
        //node data 
        for(int i = 0 ; i < node.children.size() ; i++){
            //add children data to the string
            str = str + node.children.get(i).data + " , ";
        }

        str = str + "End";
        //display the string for current node 
        System.out.println(str);
        //display for all children of current node
        for(int i = 0 ; i < node.children.size() ; i++){
            this.display(node.children.get(i));//recursive call for each child
        }
    }
}
