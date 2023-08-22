import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[9][9];

        int max = 0;
        int row = 1, col = 1;
        for(int i=0; i<n[0].length; i++) {
            for(int j=0; j<n[1].length; j++) {
                n[i][j] = sc.nextInt();
                if (n[i][j] > max) {
                    max = n[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        sc.close();
        System.out.print(max + "\n" + row + " " + col);
    }
}