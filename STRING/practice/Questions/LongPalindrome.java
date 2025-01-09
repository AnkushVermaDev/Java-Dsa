import java.util.*;

public class LongPalindrome {

    public static void main(String[] args) {

        String s = "thestewinciviclootsing";

        String finalresult = "";
        int maxlen = 0;

        // Iterate through all possible centers (for both odd and even length
        // palindromes)
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (single character center)
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > maxlen) {
                maxlen = oddPalindrome.length();
                finalresult = oddPalindrome;
            }

            // Even length palindrome (pair of characters as center)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > maxlen) {
                maxlen = evenPalindrome.length();
                finalresult = evenPalindrome;
            }
        }

        System.out.println(maxlen);
        System.out.println("the final result is: " + finalresult);
    }

    // Helper function to expand around the center
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
