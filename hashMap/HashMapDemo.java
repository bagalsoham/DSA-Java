package hashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 300);
        map.put("USA", 400);
        map.put("China", 500);
        System.out.println("Initial HashMap: " + map);

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println(value);
        }
    }
}
