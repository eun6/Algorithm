import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; //최솟값
        List<Integer> arr = new ArrayList<>();
        //각 회차
        for(int i=0; i<score.length; i++) {
            arr.add(score[i]);
            if(arr.size() > k) arr.remove(Collections.min(arr));
            answer[i] = Collections.min(arr);
        }
        return answer;
    }
}