import java.io.*;

public class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(n*k));

        br.close();
        bw.flush();
        bw.close();
    }
}