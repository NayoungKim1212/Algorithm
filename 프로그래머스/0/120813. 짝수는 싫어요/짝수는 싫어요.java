class Solution {
   static int[] solution(int n) {
        int[] result = {};

       if(n % 2 == 0) { // n이 짝수일 경우
           result = new int[n / 2]; // 배열의 길이는 n의 절반
       } else {
           result = new int[(n + 1) / 2];
       }
       for(int i = 0; i < result.length; i++) {
           result[i] = (i * 2) + 1;
       }
        return result;
    }
}