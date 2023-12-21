import java.util.*;
class Solution {
    /*
    (예외) speell의 길이 > dic의 길이 -> return 2
    중첩 for문, list, contains()을 활용.
    speell 모두 사용한 값을 찾은 즉시 return 1, break;
    */
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length; i++) {
            for(int j=0; j<spell.length; j++) {
                if(dic[i].contains(spell[j])) answer = 1;
                else {answer = 2; break;}
            }
            System.out.println();
            if(answer == 1) return 1;
        }
        return answer;
    }
}