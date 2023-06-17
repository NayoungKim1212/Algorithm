class Solution {
    public int[] solution(long n) {
  //      int[] answer = {};
 //       int length = (int)(Math.log(n)+1); // int 길이를 구하는 방법
        String s = Long.toString(n);
        int length = s.length();
        int[] answer = new int[length];
        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n % 10);
            n = n/10;
            i++;
        }

        return answer;
    }
}