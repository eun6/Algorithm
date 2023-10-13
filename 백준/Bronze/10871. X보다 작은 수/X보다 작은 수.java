
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[] a = new int[n];

        int x = sc.nextInt();
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < x) bw.write(String.valueOf(a[i]) + " ");
        }
        sc.close();
        bw.flush();
        bw.close();
    }
}