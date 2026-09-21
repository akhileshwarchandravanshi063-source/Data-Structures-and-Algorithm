
// 2904. Shortest and Lexicographically Smallest Beautiful String
import java.util.*;

class Leetcode_2904 {
    public static void main(String[] args) {
        System.out.println();
    }

    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        List<Integer> indexofOne = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int One = s.charAt(i) - '0';
            if (One == 1) {
                indexofOne.add(i);
            }
        }
        if (indexofOne.size() < k) {
            return "";
        }
        int m = indexofOne.size();
        int len = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        List<String> substr = new ArrayList<>();
        for (int j = 0; j <= m - k; j++) {
            l = indexofOne.get(j);
            r = indexofOne.get(j + k - 1);
            if (r - l + 1 < len) {
                len = r - l + 1;
                if (substr.size() > 0) {
                    substr.clear();

                }
                substr.add(s.substring(l, r + 1));
            } else if (r - l + 1 == len) {
                substr.add(s.substring(l, r + 1));

            }
        }
        if (substr.size() == 1) {
            return substr.get(0);
        }
        String smallest = substr.get(0);

        for (int i = 1; i < substr.size(); i++) {

            smallest = lexicographicallySmaller(smallest, substr.get(i));

        }

        return smallest;
    }

    public String lexicographicallySmaller(String a, String b) {
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) < b.charAt(i)) {
                return a;
            }

            if (a.charAt(i) > b.charAt(i)) {
                return b;
            }
        }
        return a;
    }
}

/*
 * optimize code:
 * class Solution {
 * public String shortestBeautifulSubstring(String s, int k) {
 * 
 * int left = 0;
 * int ones = 0;
 * 
 * String answer = "";
 * 
 * for (int right = 0; right < s.length(); right++) {
 * 
 * if (s.charAt(right) == '1') {
 * ones++;
 * }
 * 
 * while (ones > k) {
 * if (s.charAt(left) == '1') {
 * ones--;
 * }
 * left++;
 * }
 * 
 * if (ones == k) {
 * 
 * while (s.charAt(left) == '0') {
 * left++;
 * }
 * 
 * String current = s.substring(left, right + 1);
 * 
 * if (answer.equals("")
 * || current.length() < answer.length()
 * || (current.length() == answer.length()
 * && current.compareTo(answer) < 0)) {
 * 
 * answer = current;
 * }
 * }
 * }
 * 
 * return answer;
 * }
 * }
 */


// private boolean isBe(){
//     return true;
// }


