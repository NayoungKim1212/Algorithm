import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
         int minCount = 0;
        int maxCount = 0;

        for(int l : lottos){
            if(l==0) { maxCount++; }//0의 개수
            for(int w : win_nums){
                if(l==w){
                    minCount++; // 겹치는 수의 개수
                    break;
                }
            }
        }
        //최고 개수 = 0의 개수 + 겹치는수
        //최저 개수 = 겹치는 수 && 0의 개수는 필요x
        maxCount+= minCount; //
        answer[0] = (maxCount>1)? 7-maxCount : 6; // 0의 수가 0, 겹치는 수도 0 개 일 때
        answer[1] = (minCount>1)? 7-minCount : 6; // 0이 있더라도 어차피 최저순의 찾는거라 win_nums에는 해당하지 않는 수
        return answer;
    }
}