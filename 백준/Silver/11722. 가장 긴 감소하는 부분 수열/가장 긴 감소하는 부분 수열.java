import java.io.*;
import java.util.*;

public class Main {
    //최소, 1 -> d[0] = 1;
    //10(1) 30(1) 10(2) 20(2) 20(2) 10(3)
    //이전의 모든 배열값과 계속해서 비교.
    // 1) 직전값보다 작다 2)같은 값이 있었으면 dp값 동일 3) 이전 dp값보다 커야함.
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<arr.length; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
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
        br.close();
        System.out.println(max);
    }
}
