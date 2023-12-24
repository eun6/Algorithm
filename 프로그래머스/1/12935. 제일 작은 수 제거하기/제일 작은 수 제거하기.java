import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <2) {
            arr[0] = -1; return arr;
        }
        int[] answer = new int[arr.length-1];
        List<Integer> list = new ArrayList<>();
        int min = 999;
        for(int a:arr) {
            list.add(a);
            min = min < a ? min : a;
        }
        //int num = ;
        list.remove(list.indexOf(min));
        for(int i=0; i<arr.length-1; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}