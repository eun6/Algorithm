
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue q = new LinkedList();

        //큐에 채워넣기
        for(int i=1; i<n+1; i++) {
            q.offer(i);
        }
        while (q.size() != 0) {
            if(q.size() == 1) bw.write(String.valueOf(q.poll()));
            else {
                for (int i = 0; i < k; i++) {
                    if (i == k-1) bw.write(String.valueOf(q.poll()) + ", ");
                    else q.offer(q.poll());
                }
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}