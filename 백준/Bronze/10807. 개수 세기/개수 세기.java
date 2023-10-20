import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            if(st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        int v = Integer.parseInt(br.readLine());
        int index=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == v) index++;
        }
        bw.write(String.valueOf(index));

        br.close();
        bw.flush();
        bw.close();
    }
}