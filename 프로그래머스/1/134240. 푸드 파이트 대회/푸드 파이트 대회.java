class Solution {
    public String solution(int[] food) {
        String answer = "";
        int length = 0, num = 0;
        for(int i=0; i<food.length; i++) {
            num = food[i]/2;
            length += food[i]/2;
            if(num != 0) {
                for(int j=0; j<num; j++) {
                    answer += i;
                }
            }
        }
        String[] arr = answer.split("");
        answer += 0;
        for(int i=length-1; i>=0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}