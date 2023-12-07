class Solution {
    public int solution(int n) {
        int answer=0, origin=0;
        String a = Integer.toBinaryString(n);
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == '1') origin++;
        }
        for(int i=n+1; i<1000000; i++) {
            int number = 0;
            String b = Integer.toBinaryString(i);
            for(int j=0; j<b.length(); j++) {
                if(b.charAt(j) == '1') number++;
            }
            if(origin == number) {answer = i; break;}
        }
        return answer;
    }
}