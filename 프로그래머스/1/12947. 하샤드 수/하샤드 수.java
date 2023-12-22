class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int num = 0;
        for(String a:arr) {
            num += Integer.parseInt(a);
        }
        if(x % num != 0) return false;
        else return true;
    }
}