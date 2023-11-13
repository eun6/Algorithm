import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        for(int i=1; i<n+1; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0] = 0;
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<i+1; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + arr[j]);
            }
        }
        br.close();
        System.out.println(dp[n]);
    }
}
