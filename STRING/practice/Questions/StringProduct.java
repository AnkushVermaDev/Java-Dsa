public class StringProduct {

    public static String multiplyStrings(String x, String y) {
        int n = x.length();
        int m = y.length();
        int[] result = new int[n + m]; // To store the result of multiplication

        // Perform multiplication digit by digit
        for (int i = n - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = m - 1; j >= 0; j--) {
                int product = (x.charAt(i) - '0') * (y.charAt(j) - '0') + result[i + j + 1] + carry;
                result[i + j + 1] = product % 10; // Store the current digit
                carry = product / 10; // Calculate carry
            }
            result[i] += carry; // Add remaining carry to the previous position
        }

        // Convert result array to a string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString(); // Handle edge case for multiplication with 0
    }

    public static void main(String[] args) {
        String x = "123";
        String y = "456";

        String outcome = multiplyStrings(x, y);
        System.out.printf("Result: %s\n", outcome); // Should print 56088
    }
}
