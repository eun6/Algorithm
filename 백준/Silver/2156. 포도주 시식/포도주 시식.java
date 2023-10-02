import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grape = new int[n+1];
        int[] d = new int[n+1];

        //포도주 양
        for(int i=0; i<n; i++) {
            grape[i] = sc.nextInt();
        }
        //초기값
        d[0] = grape[0];
        for(int j= 1; j<n; j++) {
            if(j==1) {d[1] = grape[0] + grape[1];}
            else if(j==2) d[2] = Math.max(d[1], Math.max(grape[0]+grape[2], grape[1]+grape[2]));
            else {
                d[j] = Math.max(d[j - 1], Math.max(d[j - 2] + grape[j], d[j - 3] + grape[j - 1] + grape[j]));
            }
        }
        sc.close();
        System.out.println(d[n-1]);
    }
}
