class Solution {
    public String solution(int n) {
        String answer = "";
        Boolean a = true;
        for(int i=0; i<n; i++) {
            if(a) {
                answer += "수";
                a = false;
            } else {
                answer += "박";
                a = true;
            }
        }
        return answer;
    }
}