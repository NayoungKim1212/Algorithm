class Solution {
    public int solution(int angle) {
        if(0 < angle && angle < 90) {
            return 1;
        }
        if(90 == angle) {
            return 2;
        }
        if(90 < angle && angle < 180) {
            return 3;
        }
        if(180 == angle) {
            return 4;
        }
        return angle;
    }
}