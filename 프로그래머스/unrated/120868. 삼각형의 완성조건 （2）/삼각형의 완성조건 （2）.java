class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int c, k, longest;
        //1. sides안에 제일 긴 값 있을 때.
        longest = sides[0] > sides[1] ? sides[0] : sides[1];
        if(longest == sides[0]) k = longest-sides[1];
        else k = longest - sides[0];
        for(int i=k+1; i<=longest; i++) {
            answer++;
        }
        //2. sides안에 없을 때.
        c = sides[0] + sides[1];
        for(int i=longest+1; i<c; i++) {
            answer++;
        }
        return answer;
    }
}