package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static char getMaxOccuring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }

        // Step 2: Find character with max frequency
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

    public static ArrayList<Integer> getInterSection(int[] one, int[] two) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<one.length;i++){
            map.put(one[i], false);
        }
        for(int j = 0 ; j < two.length;j++){
            if(map.containsKey(two[j])){
                map.put(two[j], true);
            }
        }
        Set<Map.Entry<Integer,Boolean>> entries = map.entrySet();
        for(Map.Entry<Integer,Boolean> entry : entries){
            if(entry.getValue() == true){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 300);
        map.put("USA", 400);
        map.put("China", 500);
        System.out.println("Contains 'Soham': " + map.containsKey("Soham"));
        System.out.println("Initial HashMap: " + map);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        String str = "abbcccddddeeeeaaaaaaaaaae";
        System.out.println("Max occurring character: " + getMaxOccuring(str));
        
        int[] one = {5,1,3,4,7};
        int[] two = {2,4,3,5,7,10,15};
        ArrayList<Integer> list = getInterSection(one, two);
        System.out.println("Intersection: " + list);

    }
}
