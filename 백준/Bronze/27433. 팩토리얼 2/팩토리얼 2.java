import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(fn(n));
    }
    static long fn(long n) {
        if (n==0 || n==1) {
            return 1;
        }
        return n*fn(n-1);
    }
}
