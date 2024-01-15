class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length()-4;
        for(int i=0; i<num; i++) {
            answer += "*";
        }
        String a = phone_number.substring(num, phone_number.length());
        answer += a;
        return answer;
    }
}