class Solution {
  static String solution(String my_string) {
        String result = "";

        StringBuilder sb = new StringBuilder(my_string);
        String reversedStr = sb.reverse().toString();

        return reversedStr;


    }
}