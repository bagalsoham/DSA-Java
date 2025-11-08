import java.util.HashSet;
import java.util.Set;

public class DistributecandyType {
    public int distributecandyType(int[] candyType){
        int n  = candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i <candyType.length; i++){
            set.add(candyType[i]);
        }
        int setSize = set.size();
        int ans = setSize < n ? setSize : n;
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
