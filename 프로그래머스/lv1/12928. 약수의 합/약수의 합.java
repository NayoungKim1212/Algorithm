class Solution {
    public int solution(int n) {
        int answer = 0;
                for (int i = 1; i <= n; i++) { // 약수는 1부터 n까지
            if(n % i == 0) { // 나머지가 0인 경우
                answer += i; // answer에 더한 후 저장
            }
        }
        return answer;
    }
}