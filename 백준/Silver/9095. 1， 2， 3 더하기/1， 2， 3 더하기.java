import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 테이블 정의(개수를 입력받는 반복문.)
        // - 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타나내는 경우의 수
        // 2. 점화식 : D[n] = D[n-3] + D[n-2] + D[n-1]
        // 3. 초기값 정하기 : D[0] = D[1] = 1
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int n = sc.nextInt();
            bw.write(print(n) + "\n");
        }
        bw.flush();
        bw.close();
        sc.close();
    }
    static int print(int n) {
        int[] D = new int[n+1];
        D[0] = D[1] = 1;
        if (n<2) {
         return 1;
        } else {
            D[2] = 2;
            for(int i=3; i<n+1; i++) {
                D[i] = D[i-3] + D[i-2] + D[i-1];
            }
        }
        return D[n];
    }
}
