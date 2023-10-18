import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Queue q = new LinkedList();
        int last = 0;

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            switch (a) {
                case "push":
                    int num = Integer.parseInt(st.nextToken()); last = num;
                    q.add(num); break;
                case "pop":
                    if(q.size()<1) bw.write(-1 + "\n");
                    else bw.write(q.poll()+ "\n");
                    break;
                case "size":
                    bw.write(q.size()+ "\n"); break;
                case "empty":
                    if(q.size()<1) bw.write(1+ "\n");
                    else bw.write(0+ "\n");
                    break;
                case "front":
                    if(q.size()<1) bw.write(-1+ "\n");
                    else bw.write(q.peek()+ "\n");
                    break;
                case "back":
                    if(q.size()<1) bw.write(-1+ "\n");
                    else bw.write(last + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
