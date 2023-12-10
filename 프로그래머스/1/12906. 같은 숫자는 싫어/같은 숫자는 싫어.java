import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) s.push(arr[i]);
        }
        int[] answer = new int[s.size()];
        for(int i=0; i<s.size(); i++) {
            answer[i] = s.get(i);
        }
        return answer;
    }
}