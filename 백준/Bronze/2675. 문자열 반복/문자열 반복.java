
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if(st.hasMoreTokens()) {
                int R = Integer.parseInt(st.nextToken());
                String S = st.nextToken();
                for(int j=0; j<S.length(); j++) {
                    char c = S.charAt(j);
                    for(int k=0; k<R; k++) {
                        bw.write(c);
                    }
                }
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}