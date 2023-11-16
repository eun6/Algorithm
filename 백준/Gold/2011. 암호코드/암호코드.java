import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int[] dp = new int[num.length()+1];
        dp[0] = dp[1] = 1;
        for(int i=2; i<=num.length(); i++) {
            int c = num.charAt(i-1) - '0';
            if(c > 0 && c < 10) dp[i] = dp[i-1] % 1000000;
            int c2 = num.charAt(i-2) -'0';
            if((c+c2*10) >= 10 && (c+c2*10) <= 26) {
                dp[i] = (dp[i] + dp[i-2]) % 1000000;
            }
        }
        bw.write(String.valueOf(num.equals("0") || num.charAt(0) == '0'? 0 : dp[num.length()]));
        br.close();
        bw.flush();
        bw.close();
    }
}
