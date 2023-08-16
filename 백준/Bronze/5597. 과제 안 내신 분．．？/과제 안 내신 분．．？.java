import java.io.*;

public class Main {
    //1. 1~30까지의 학생 수를 담을 배열
    //2. 28개 항목을 입력 받음
    //3. 제출하지 않은 학생의 출석번호를 작은 순대로 출력

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] n = new boolean[30];
        for(int i=0; i<28; i++) {
            int num = Integer.parseInt(br.readLine());
            n[num-1] = true;
        }
        for(int j=0; j<30; j++) {
            if (n[j] != true) {
                bw.write(j+1+"\n");
            }
        }
        br.close();
        bw.flush();
    }
}
