import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n;
        while((n = br.readLine()) != null && !n.isEmpty()) {
            int small = 0, big = 0, num = 0, blank = 0;
            for(int i=0; i<n.length(); i++) {
                char c = n.charAt(i);
                if(c >= 'a' && c <= 'z') small++;
                else if(c >= 'A' && c <= 'Z') big++;
                else if(c >='0' && c <= '9') num++;
                else blank++;
            }
            bw.write(small + " " + big + " " + num + " " + blank+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}