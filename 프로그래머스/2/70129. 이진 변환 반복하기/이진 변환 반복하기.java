class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        while(!s.equals("1")) {
            int length = s.length();
            s = s.replace("0", "");
            if(length == 0) break;
            answer[1] += (length - s.length());
            s = Long.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}