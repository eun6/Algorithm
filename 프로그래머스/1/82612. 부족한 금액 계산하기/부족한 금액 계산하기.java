class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long example = 0;
        for(int i=0; i<count; i++) {
            example = example + price*(i+1);
        }
        answer = example >= money ? example-money : 0;
        return answer;
    }
}