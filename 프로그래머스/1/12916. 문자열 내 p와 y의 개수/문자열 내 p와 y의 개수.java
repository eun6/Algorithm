class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0, b = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') a++;
            if(c == 'y' || c == 'Y') b++;
        }
        answer = a == b ? true : false;
        return answer;
    }
}