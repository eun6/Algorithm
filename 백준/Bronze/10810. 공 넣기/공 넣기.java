import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        int m = sc.nextInt();

        for(int x=0; x<m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int g=i-1; g<j; g++) {
                n[g] = k;
            }
        }
        for(int y=0; y<num; y++) {
            System.out.print(n[y] + " ");
        }
        sc.close();
    }
}
