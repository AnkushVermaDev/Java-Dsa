public class MinWindow {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int start = 0;
        int end = 0;
        int startIndex = 0;
        int balance = 0;
        int size = Integer.MAX_VALUE;
        int[] freq = new int[128];
        for (char c : tArray) {
            balance++;
            freq[c]++;
        }

        while (end < sArray.length) {
            if (freq[sArray[end]] > 0) {
                balance--;
            }
            freq[sArray[end]]--;
            end++;
            while (balance == 0) {
                if (end - start < size) {
                    size = end - start;
                    startIndex = start;
                }
                if (freq[sArray[start]] == 0) {
                    balance++;
                }
                freq[sArray[start]]++;
                start++;
            }
        }
         

        System.out.println(size == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + size));


        }
}
