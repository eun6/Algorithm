import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] n = new String[5][15];

        for(int i=0; i<5; i++) {
            String[] a = br.readLine().split("");
            for(int j=0; j<a.length; j++) {
                n[i][j] = a[j];
            }
        }
        br.close();
        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                if(n[i][j] == null) continue;
                System.out.print(n[i][j]);
            }
        }
    }
}