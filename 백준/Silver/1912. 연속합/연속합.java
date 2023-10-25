import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        d[0] = arr[0];
        for(int i=1; i<n; i++) {
            d[i] = Math.max(arr[i], d[i-1]+arr[i]);
        }
        int max = arr[0];
        for(int i=0; i<n; i++) {
            max = d[i]>max? d[i] : max;
        }
        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}