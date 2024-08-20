class Solution {
   static int solution(int n, int k) {
        int service = n / 10; // 10인분 당 1개
        int yang    = n * 12000; // 1인분 당 12000원
        int juice   = 2000 * (k - service); // 10인분 당 음료 1개가 서비스로 주어지므로 원래 음료 가격에서 서비스로                                                 받은 음료를 제외한 값
        return yang + juice; // 총 지불할 값
    }
}



