import java.util.Scanner;
public class Main {
    //최소, 1 -> d[0] = 1;
    //10(1) 30(1) 10(2) 20(2) 20(2) 10(3)
    //이전의 모든 배열값과 계속해서 비교.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                int a = Math.abs(arr[i]-arr[j]);
                if(arr[j]>arr[i] && dp[i] < dp[j]+1) {
                    dp[i] = dp[j] + 1;
                } else if (arr[i] == arr[j]) {
                    dp[i] = dp[j];
                }
            }
        }
        int max = 0;
        for(int i=0; i<dp.length; i++) {
            max = dp[i]>max?dp[i]:max;
        }
        sc.close();
        System.out.println(max);
    }
}
