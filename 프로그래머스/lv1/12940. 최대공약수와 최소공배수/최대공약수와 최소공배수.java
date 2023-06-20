class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // [최대공약수,최소공배수]
        // 유클리드 호제법 : 최대 공약수를 구한 뒤 두 수의 곱 / 최대공약수 = 최소공배수
        answer[0] = gcd(n, m); // 최대 공약수
        answer[1] = m * n / answer[0]; // 최소 공배수


        return answer;
    }

    public static int gcd(int n, int m) {
        if (m == 0) return n; // gcd(a,b) = gcd(b,r) => r = a % b
        else return gcd(m, n % m);
    }
}
