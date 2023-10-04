import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] d = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            if(st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++) {
            d[i] = 1; //자기 하나면 값이 1.
            for(int j=0; j<i; j++) {
                //이전의 원소가 현재값보다 작고, 현재 누적값(1)보다 이전 누적값+1이 더 클때
                if(arr[j] <arr[i] && d[i] < d[j] +1) {
                    d[i] = d[j] +1;
                }
            }

        }
        int max = 0;
        for(int i=0; i<n; i++) {
            max = d[i] > max ? d[i]:max;
        }
        br.close();
        System.out.println(max);
    }
}
