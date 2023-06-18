import java.time.DayOfWeek;
import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
            String answer = "";

            int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
            String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int Adate = 0; // 2016년의 몇번째날인가?
            // Adate를 구하기 위한 부분
            for(int i = 0 ; i< a-1; i++){
                Adate += c[i];
            }
            Adate += b-1;

            // 나누기 7을 했을 때 나머지로 요일 찾기
            answer = MM[Adate %7];

            return answer;
    }
}