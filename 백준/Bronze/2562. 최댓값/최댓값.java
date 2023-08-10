import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int max_index=0;
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i]= Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max=arr[i];
                max_index=i+1;
            }
        }
        br.close();
        bw.write(max + "\n" + max_index);
        bw.flush();
    }

}
