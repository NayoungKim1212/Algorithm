class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int Numer1 = numer1 * denom2; // 분자1
        int Numer2 = numer2 * denom1; // 분자2
        int Numer = Numer1 + Numer2; // 분자 덧셈
        int Denom = denom1 * denom2; // 통분
        
        int gcd = 0;
        // 최대 공약수 찾기
        for(int i = 1; i <= Numer && i <= Denom; i++) {
            if(Numer % i == 0 && Denom % i == 0) {
                gcd = i;
            }
        }
        Numer = Numer / gcd; // 기약분수 분자
        Denom = Denom / gcd; // 기약분수 분모
        
        int[] answer = {Numer, Denom};
        return answer;
    }
}