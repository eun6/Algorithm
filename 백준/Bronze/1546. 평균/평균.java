import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        float[] arr = new float[n];
        float max=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
                max = arr[i] > max? arr[i] : max;
            }
        }
        float sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = (arr[i]/max) * 100;
            sum += arr[i];
        }
        bw.write(String.valueOf(sum/n));
        br.close();
        bw.flush();
        bw.close();
    }
}
