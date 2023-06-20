import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 여벌 체육복을 가져온 학생이 도난 당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++; // 자기 옷을 입으면 되니까 증가
                    lost[i] = -1; // 도난당한 학생 리스트에서 제외
                    reserve[j] = -1; // 체육복을 빌려줄 수 없음
                    break;
                }
            }
        }
        // 도난 당한 학생에게 체육복을 빌려주는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    reserve[j] = -1; // 빌려주는 학생은 더 이상 빌려줄 수 없음
                    lost[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}