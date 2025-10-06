import java.util.ArrayList;

public class boardPath {
    public static void main(String[] args) {
        int start = 0;
        int end = 3;  // You can change this value to any endpoint you want
        
        ArrayList<String> paths = getBoardPath(start, end);
        System.out.println("All possible paths from " + start + " to " + end + ":");
        System.out.println(paths);
        System.out.println("Total paths: " + paths.size());
    }

    public static ArrayList<String> getBoardPath(int curr, int end){
        if (curr == end) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (curr > end) {
            return new ArrayList<>();       
        }

        ArrayList<String> mr = new ArrayList<>();
        for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {
            ArrayList<String> rr = getBoardPath(curr + dice, end);
            for (String s : rr) {
                mr.add(dice + s);
            }
        }
        return mr;
    }
}
