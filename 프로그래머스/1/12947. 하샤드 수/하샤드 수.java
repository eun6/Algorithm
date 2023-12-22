class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String y = String.valueOf(x);
        String[] arr = y.split("");
        int num = 0;
        for(int i=0; i<arr.length; i++) {
            num += Integer.parseInt(arr[i]);
        }
        if(x % num != 0) answer = false;
        return answer;
    }
}