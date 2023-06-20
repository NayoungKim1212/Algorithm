import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2; // 총 N마리의 포켓몬 중에서 N/2만큼 가져감
        HashSet<Integer> set = new HashSet<>(); // 중복 제거
        for (int i : nums) {
            set.add(i);
        }
        if(pick >= set.size()) answer = set.size();
        else answer = pick;        
        return answer;
    }
}