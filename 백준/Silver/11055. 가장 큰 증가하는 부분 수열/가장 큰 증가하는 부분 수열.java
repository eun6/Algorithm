import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //수열 입력
        for(int i=0; i<n; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        //dp배열, 현재값이 이전값보다 클때만 입력값 누적.
        for(int i=0; i<n; i++) {
            d[i] = arr[i];
            for(int j=0; j<i; j++) {
                if(arr[j]<arr[i] && d[i] <d[j]+arr[i]) {d[i] = d[j]+arr[i];}
            }
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            max = d[i]>max? d[i] : max;
        }
        br.close();
        System.out.println(max);
    }
}
