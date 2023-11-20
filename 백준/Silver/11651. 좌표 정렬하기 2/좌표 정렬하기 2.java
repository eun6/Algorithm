import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] input = new int[n][2];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if(st.hasMoreTokens()) {
                input[i][0] = Integer.parseInt(st.nextToken());
                input[i][1] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(input, (a, b) -> {
           if(a[1] == b[1]) return a[0]-b[0];
           else return a[1]-b[1];
        });
        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                bw.write(input[i][j] + " ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
