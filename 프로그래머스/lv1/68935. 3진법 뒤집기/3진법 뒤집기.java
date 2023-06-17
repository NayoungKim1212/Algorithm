class Solution {
    public int solution(int n) {
        String three = "";
        while(n>0) {
            int num = n % 3;
            n = n / 3;
            three += String.valueOf(num);
        }
        return Integer.parseInt(three,3); // 10진수를 3진수로 변환
    }
}