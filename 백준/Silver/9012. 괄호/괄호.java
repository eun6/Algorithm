
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for(int j=0; j<a.length(); j++) {
                char b = a.charAt(j);
                if (b == '(') {stack.push(b);}
                else {
                    if(stack.size() == 0) {stack.push(b); break;}
                    else {stack.pop();}
                }
            }
            if (stack.isEmpty()) bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
            stack.clear();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}