class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10; // "*" 값
        int right = 12; // "#" 값
        StringBuilder sb = new StringBuilder();
        // 1,4,7,11 -> %3 했을 때 나머지 1/ 2,5,7, 10 -> 2/ 3,6,9,12 -> 0
        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = number;
            } else {
                if(number == 0) number = 11;
                int ld = (Math.abs(number-left) / 3 + Math.abs(number-left) % 3);
                int rd = (Math.abs(number-right) / 3 + Math.abs(number-right) % 3);

                if (ld > rd) {
                    sb.append("R");
                    right = number;
                }else if (ld < rd) {
                    sb.append("L");
                    left = number;
                }else if (hand.equals("right")) {
                    sb.append("R");
                    right = number;
                }else {
                    sb.append("L");
                    left = number;
                }
            }

        }
        return sb.toString();
    }
}