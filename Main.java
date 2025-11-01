import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nextFloor = new int[n];
        for (int i = 0; i < n; i++) {
            nextFloor[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];
        int currentFloor = 0;
        boolean loopFound = false;

        while (currentFloor != -1 && currentFloor < n) {
            if (visited[currentFloor]) {
                System.out.println("Loop found at " + currentFloor);
                loopFound = true;
                break;
            }
            visited[currentFloor] = true;
            currentFloor = nextFloor[currentFloor];
        }

        if (!loopFound) {
            System.out.println("No loop found");
        }

        sc.close();
    }
}
