class Solution {
    public int solution(int left, int right) {
        int answer = 0;
                for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) { // j = 1부터 i까지
                if(i % j == 0) { // 나머지가 0인 경우 판별
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }
}