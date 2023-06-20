import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // 1. 테이블 정의
        // - 2xn크기의 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 10,007로 나눈 나머지 값
        // 1) 입력받은 n의 크기에 해당하는 직사각형을 채울 경우의 수 -> 피보나치 수열
        // 2) 경우의 수를 10,007로 나눈 값을 구하고 출력
        /*
        * n = 2
        * 2 = 1+1, (2)*2
        * n = 3
        * 3 = 1+1+1, (2+1, 1+2)*2,
        * n = 4
        * 4 = 1+1+1+1, (1+1+2, 1+2+1, 2+1+1, 2+2) *2
        * */

        // 2. 점화식
        // D[n] = D[n-1] + D[n-2]*2
        // 3. 초기값 정하기
        // D[1] = 1, D[2] = 2

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] D = new int[n+1];
        D[0] = D[1] = 1;

        if (n < 2) {
            System.out.print(1);
        } else {
            for(int i=2; i<n+1; i++) {
                D[i] = (D[i-1] + D[i-2]*2) %10007;
            }
            System.out.print(D[n]);
        }
        sc.close();
    }
}
