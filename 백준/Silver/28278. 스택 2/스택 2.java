
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while(n != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), (" "));

            if(st.hasMoreTokens()) {
                int put = Integer.parseInt(st.nextToken());
                switch (put) {
                    case 1:
                        int x = Integer.parseInt(st.nextToken());
                        stack.push(x);
                        break;
                    case 2:
                        if(stack.isEmpty()) bw.write(-1 + "\n");
                        else {bw.write(stack.lastElement() + "\n"); stack.pop();}
                        break;
                    case 3:
                        bw.write(stack.size() + "\n");
                        break;
                    case 4:
                        if(stack.isEmpty()) bw.write(1 + "\n");
                        else bw.write(0 + "\n");
                        break;
                    case 5:
                        if(stack.isEmpty()) bw.write(-1 + "\n");
                        else bw.write(stack.lastElement() + "\n");
                        break;
                }
            }
            n--;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}