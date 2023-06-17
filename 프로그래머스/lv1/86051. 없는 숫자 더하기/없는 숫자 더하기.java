class Solution {
     public static int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) { // 0부터 number의 길이만큼 for문을 사용해 반복 출력
            answer += numbers[i]; // 출력해서 나온 값을 다 더한 후 answer에 저장
        }
        return 45 -answer; // 
    }
}
