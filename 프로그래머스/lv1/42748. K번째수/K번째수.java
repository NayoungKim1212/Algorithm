import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // i~j까지 자른 후 Arrays.sort -> array[k] 찾기
        // 2~5 => 2,3,4,5
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작위치
            int end = commands[i][1]; // 끝 위치
            int select = commands[i][2]; // 선택할 위치
            int[] split = Arrays.copyOfRange(array, start-1, end); // 원본 배열,복사할 시작인덱스. 복사랄 끝 인덱스
            Arrays.sort(split);
            answer[i] = split[select-1];
        }
        return answer;
    }
}