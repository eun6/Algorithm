import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            bw.write(fn(k)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static long fn(int k) {
        long[] d = new long[k+1];
        d[0] = 1;
        int i=1;
        while(i<=k) {
            if(i < 4) {
                d[i] = d[0];
            } else if(i > 3 && i < 6) {
                d[i] = 2;
            } else {
                d[i] = d[i - 1] + d[i - 5];
            }
            i++;
        }
        return d[k];
    }
}
