class Solution {
    //처음(x, y) x = 첫 행 위치, y = 첫 열의 위치
    //나중(z, k) z = 마지막 행의 위치, k = 마지막 열의 위치
    public int[] solution(String[] wallpaper) {
        int[] answer = {999, 999, 0, 0};
        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[0].length(); j++) {
                arr[i][j] = wallpaper[i].charAt(j);
                if(arr[i][j] == '#') {
                    answer[0] = i > answer[0] ? answer[0] : i;
                    answer[1] = j > answer[1] ? answer[1] : j;
                    answer[2] = i > answer[2] ? i : answer[2];
                    answer[3] = j > answer[3] ? j : answer[3];
                }
            }
        }
        answer[2] += 1; answer[3] +=1;
        return answer;
    }
}