import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호를 정렬하여 순서대로 비교
        Arrays.sort(phone_book);
        // 인접한 전화번호끼리만 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호가 다음 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                // startsWith : 시작하는 문자열을 확인하는 메서드
                return false;
            }
        }

        // 모든 전화번호에 대해 접두어가 없으면 true 반환
        return true;
    }
}