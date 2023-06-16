class Solution {
    public long solution(int a, int b) {
        long answer = 0;

            int n1; // 큰수
            int n2; // 작은수
            // 1.
            // a, b 중 큰수와 작수를 판단
            // n1 = 큰 수 , n2 = 작은 수
            // 변수 = (조건식) ? 참일 때 값 : 거짓일 때 값
            // n1 = (a > b) ? a:b;
            // n2 = (a > b) ? b:a;
            if(a > b){
                n1 = a;
                n2 = b;
            }else{
                n1 = b;
                n2 = a;
            }

            for(int i = n2; i <= n1; i++)
                answer += i;
               return answer;
    
    }
}