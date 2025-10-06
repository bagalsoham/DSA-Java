import java.util.ArrayList;

public class mazePathDiagonal {
    public static void main(String[] args) {
        int er = 2; // end row
        int ec = 2; // end column
        ArrayList<String> paths = getMazePathDiagonal(0, 0, er, ec);
        System.out.println("All possible paths from (0,0) to (" + er + "," + ec + "):");
        System.out.println(paths);
        System.out.println("Total paths: " + paths.size());
    }
   public static ArrayList<String> getMazePathDiagonal(int cr , int cc , int er, int ec){
        if( cr == er && cc == ec){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if( cr > er || cc > ec){
            return new ArrayList<>();
        }
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recursionResultOfHorizontalCall = getMazePathDiagonal(cr, cc+1, er, ec);
        for(String s : recursionResultOfHorizontalCall){
            myResult.add("h" + s);
        }
        ArrayList<String> recursionResultOfVerticalCall = getMazePathDiagonal(cr+1, cc, er, ec);
        for(String s : recursionResultOfVerticalCall){
            myResult.add("v" + s);
        }
        ArrayList<String> recursionResultOfDiagonalCall = getMazePathDiagonal(cr+1, cc+1, er, ec);
        for(String s : recursionResultOfDiagonalCall){
            myResult.add("d" + s);
        }
        return myResult;
    }
 
}
