class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int list = end-start+1;
        for (int i = 0; i < list; i++) {
            answer[i] = start++;
        }
        return answer;
    }
}