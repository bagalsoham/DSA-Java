package myqueue;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        char ch = s.next().charAt(0);

        while (ch != '.') {
            q.add(ch);

            if(map.containsKey(ch)){
                int oldValue = map.get(ch);
                map.put(ch, oldValue + 1);
            } else {
                map.put(ch, 1);
            }
            // Remove all repeating characters from queue front
            while (!q.isEmpty()) {
                char front = q.peek();
                if(map.get(front) == 1){
                    System.out.println(front);
                    break;
                }
                else{
                    q.poll();
                }
            }

            // Print current first non-repeating character
            if (q.isEmpty()) {
                System.out.println(-1);
            } 
            

            ch = s.next().charAt(0);
        }

        s.close();
    }
}
