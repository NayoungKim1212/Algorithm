import java.util.Arrays;
class Solution {
    public String solution(String s) {
        // 소문자 배열과 대문자 문자열 나눠야해요
        String up_s = "";
        String down_s = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                up_s += s.charAt(i);
            else down_s += s.charAt(i);
        }

        String[] UP = up_s.split("");
        String[] DOWN = down_s.split("");

        Arrays.sort(UP);
        Arrays.sort(DOWN);

        String answer = "";
        // 소문자를 거꾸로 붙이기
        for(int i = DOWN.length-1; i >= 0; i--)
            answer += DOWN[i];
        for(int i = UP.length-1; i >= 0; i--)
            answer += UP[i];
        return answer;
    }
}