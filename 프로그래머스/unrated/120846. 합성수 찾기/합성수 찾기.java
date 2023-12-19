class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean a = false;
        //약수가 3개 이상? 소수 아닌 수.
        for(int i=1; i<=n; i++) {
            for(int j=1; j*j<=i; j++) {
                if(i%j == 0 && i > 3 && j != 1) {
                    answer++; break;}
            }
        }
        return answer;
    }
}