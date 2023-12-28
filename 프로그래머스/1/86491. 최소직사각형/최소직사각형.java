class Solution {
    //1. 부분 집합에서 더 큰 쪽을 sizes[i][0] 위치로 바꿈.
    //2. 왼쪽값에서 max, 오른쪽 값에서 max 찾아 곱하기
    public int solution(int[][] sizes) {
        int tmp = 0, max1 = 0, max2 = 0;
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            System.out.println(sizes[i][0] + " " + sizes[i][1]);
            max1 = sizes[i][0] > max1 ? sizes[i][0] : max1;
            max2 = sizes[i][1] > max2 ? sizes[i][1] : max2;
        }
        return max1*max2;
    }
}