class Solution {
    /*
    1. (횟수 세기) words를 n 단위로 끊어서 판단(num++)
    2. 동일 단어가 이미 나온 적 있다면 stop, num값과 words에서의 자릿값 반환.
    3. 이전 단어의 끝 글자 != 현재 단어의 시작 글자 -> stop.
    */
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int num = 2;
        for(int i=1; i<words.length; i++) {
            if(num > n) num = 1; //초기화
            char end = words[i-1].charAt(words[i-1].length()-1);
            char first = words[i].charAt(0);
            if(end != first || Duplicate(words, i)) { //break 1.
                answer[0] = num; answer[1] = i/n +1; break;
            }
            num++;
            
        }
        return answer;
    }
    static public boolean Duplicate(String[] words, int currentIndex) {
        for(int j=0; j<currentIndex; j++) { //break 2.
                if(words[currentIndex].equals(words[j])){
                    return true;
            }
        }
        return false;
    }
}