class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int c; int num;
        char a, b;
        for(int i=0; i<s.length(); i++) {
            a = s.charAt(i);
            c = a+n;
            if(Character.isLowerCase(a)) {
                if(c > 'z') {
                    c = 'a' + (c-'z'-1);
                }
            }
            else if(Character.isUpperCase(a)) {
                if(c > 'Z') {
                    c = 'A' + (c-'Z'-1);
                }
            } else c = ' ';
            b = (char)(c);
            answer += b;
        }
        return answer;
    }
}