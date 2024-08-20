import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
                ArrayList<Integer> list = new ArrayList<Integer>();
        int num = -1; // 0 ~ 9에 영향을 받지 않는 수 임의 지정
        for (int i = 0; i < arr.length ; i++) {
            
            if(arr[i] != num){ // 01/ 12/ 23/ 34/ 45/ ind=5 :56/idx = 6  67
                list.add(arr[i]);
                num = arr[i]; //1
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}