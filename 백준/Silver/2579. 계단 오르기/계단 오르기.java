import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        int[] d = new int[n+1];

        for(int i=1; i<n+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        d[1] = arr[1];

        if(n > 1) {
            d[2] = arr[1] + arr[2];
        }
        for(int i=3; i<n+1; i++) {
            d[i] = Math.max(d[i-2], d[i-3]+arr[i-1]) + arr[i];
        }
        br.close();
        System.out.println(d[n]);
    }
}
