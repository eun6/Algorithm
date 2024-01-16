class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            //(도움) 비트 or 연산 실행 -> 공백을 0으로 채우기(Stringformat) -> 0은 공백, 1은 #으로 작성.
            String binaryStr = Integer.toBinaryString(arr1[i] | arr2[i]);
            binaryStr = String.format("%" + n + "s", binaryStr).replace(' ', '0');
            answer[i] = binaryStr.replace('0', ' ').replace('1', '#');
        }
        return answer;
    }
}