import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = 99999;
            for(int j=1; j<=i/2; j++) {
                //자기가 제곱수인 경우
                if(j*j == i) {
                    dp[i] = 1; break;
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        br.close();
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();

    }
}
