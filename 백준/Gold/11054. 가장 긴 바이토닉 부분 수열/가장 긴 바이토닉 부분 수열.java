import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] first;
    static int[] after;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        first = new int[n];
        after = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        first();
        after();

        //max, secondMax 값 찾기
        int max = 0;
        for(int i=0; i<n; i++) {
            max = (max < first[i] + after[i]) ? first[i] + after[i] : max;
        } System.out.println(max - 1);
        br.close();
    }
    public static void first() {
        for(int i=0; i<n; i++) {
            first[i] = 1;
            //max 이전
            for(int j=0; j<i; j++) {
                if(arr[j] < arr[i] && first[i] < first[j] +1) first[i] = first[j] + 1;
            }
        }
    }
    public static void after() {
        //시작이 뒤
        for(int i=n-1; i >= 0; i--) {
            after[i] = 1;
            //max 이전
            for(int j=n-1; j>=0; j--) {
                if(arr[j] < arr[i] && after[i] < after[j] +1) after[i] = after[j] + 1;
            }
        }
    }
}