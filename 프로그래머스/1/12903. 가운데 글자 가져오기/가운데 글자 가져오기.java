class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        int a = s.length() / 2;
        answer = s.length()%2 <= 0 ? arr[a-1] + arr[a] : arr[a];
        return answer;
    }
}