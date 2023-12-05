import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> count = new HashMap<>(); // 중복X
        for(String[] cloth : clothes) { // 의상 종류별 개수 세기
            String kind = cloth[1];
            count.put(kind, count.getOrDefault(kind, 0) + 1);
        }
        // 각 종류별 의상 개수를 이용하여 조합의 수 계산
        int answer = 1;
        for(int counter : count.values()) {
            answer *= counter + 1; // (의상 개수 + 1)을 모든 종류에 대해 곱함
        }
        return answer -1; // 아무 의상도 선택하지 않은 경우 1을 빼줌
    }
}