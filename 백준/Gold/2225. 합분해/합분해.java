import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[k+1][n+1];

        for(int i=0; i<k+1; i++) {
            dp[i][1] = i;
        }
        for(int i=0; i<n+1; i++) {
            dp[1][i] = 1;
        }
        for(int i=2; i<k+1; i++) {
            for(int j=2; j<n+1; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])% 1000000000;
            }
        }
        br.close();
        bw.write(String.valueOf(dp[k][n]));
        bw.flush();
        bw.close();
    }
}
