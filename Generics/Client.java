package Generics;

public class Client {
    public static void main(String[] args)  throws Exception {
        HashTable<String, Integer> ht = new HashTable<>(5);
        ht.put("India", 1);
        ht.put("USA", 2);
        ht.put("China", 3);
        ht.display();
    }
}
