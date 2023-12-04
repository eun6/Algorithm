import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int a = commands[i][0]-1;
            int b = commands[i][1]-1;
            int c = commands[i][2]-1;
            int k = b-a+1;
            int[] arr = new int[k];
            for(int j=0; j<k; j++) {
                arr[j] = array[a+j];
            }
            Arrays.sort(arr);
            answer[i] = arr[c];
        }
        return answer;
    }
}