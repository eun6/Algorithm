import java.util.*;

public class Main {
    public static void main(String args[]) {
        int max = 0;
        int max_index=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i]= sc.nextInt();
            if (arr[i] > max) {
                max=arr[i];
                max_index=i+1;
            }
        }
        sc.close();
        System.out.print(max + "\n" + max_index);
    }
}