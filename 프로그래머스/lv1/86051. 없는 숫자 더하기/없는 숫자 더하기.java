import java.util.Arrays;
class Solution {
     public static int solution(int[] numbers) {
                 int answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = 45 - sum;
        return answer;
//         int answer = 0;
//         boolean[] flag = new boolean[10];
//         Arrays.fill(flag, false);

//         for(int i = 0; i <= 9; i++){
//             for(int j : numbers){
//                 if(i == j)
//                     flag[i] = true;
//             }
//         }

//         for(int i = 0; i < flag.length; i++){
//             if(flag[i] == false)
//                 answer += i;
//         }
//         return answer;
    }
}