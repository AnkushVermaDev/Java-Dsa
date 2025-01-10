public class LongPalindrome {

    public static void main(String[] args) {

        String s = "fridaycivicavaaddams";
        StringBuffer stb = new StringBuffer();
        int maxfinder = 0;
        String word = "";
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            stb.setLength(0);

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    word = s.substring(i, j + 1);
                    stb.append(word);

                    if (stb.reverse().toString().equals(word)) {

                        if (word.length() > maxfinder) {
                            maxfinder = word.length();
                            longestPalindrome = word; // Update the longest palindrome
                        }

                    }

                    // Reset stb for the next comparison
                    stb.setLength(0);
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

}
