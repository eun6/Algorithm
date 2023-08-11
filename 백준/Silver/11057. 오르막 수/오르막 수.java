import java.util.*;

public class Main {
    static int[][] dp;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1][10];

        for(int i=0; i<10; i++) {
            dp[1][i] = 1;
        }
        for(int j=2; j<n+1; j++) {
            dp[j][0] = 0;
            for(int i=0; i<10; i++) {
                for(int k=0; k<i+1; k++) {
                    dp[j][i] += dp[j-1][k];
                    dp[j][i] %= 10007;
                }
            }
        }
        sc.close();

        int sum=0;
        for(int i=0; i<10; i++) {
            sum += dp[n][i];
        }
        System.out.print(sum%10007);
    }
}