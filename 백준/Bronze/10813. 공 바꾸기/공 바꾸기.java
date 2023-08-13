import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        int[] save = new int[num];

        int m = sc.nextInt();

        //초기값 반복문
        for(int y=0; y<num; y++) {
            n[y] = y+1;
        }

        for(int x=0; x<m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            save[i-1] = n[i-1]; //기존 값 복사
            n[i-1] = n[j-1]; //값 바꿈
            n[j-1] = save[i-1];
        }

        for(int arr:n) {
            System.out.print(arr + " ");
        }
        sc.close();
    }
}
