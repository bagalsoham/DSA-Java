package Generics;

public class Demo {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        displayGeneric(intArray);

        String[] strArray = { "Hello", "World", "Generics", "in", "Java" };
        displayGeneric(strArray);

    }

    /* public static void display(Integer[] array) {
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    //Method Overloading with different parameter type
    public static void display(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    } */
   
    //Generic Method
    public static <T> void displayGeneric(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    } 

}
