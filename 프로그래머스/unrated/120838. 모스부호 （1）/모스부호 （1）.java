class Solution {
    public String solution(String letter) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] morse = letter.split(" ");
        
        for(String c : morse) {
            for(int i=0; i<arr.length; i++) {
                if(c.equals(arr[i])) {answer += Character.toString(i+97);}
            }
        }
        return answer;
    }
}