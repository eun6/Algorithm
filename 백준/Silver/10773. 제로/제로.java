
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        for(int i=0; i<k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) {
                if(stack.isEmpty()) {continue;}
                else stack.pop();
            }
            else {stack.push(n);}
        }
        int sum = 0;
        for(int j=0; j<stack.size(); j++) {
            sum += stack.get(j);
        }
        br.close();
        System.out.println(sum);
    }
}