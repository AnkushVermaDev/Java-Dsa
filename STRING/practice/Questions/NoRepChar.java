public class NoRepChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        StringBuffer result = new StringBuffer();

        // Check frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.indexOf(current) == str.lastIndexOf(current)) { // if first occurance char and last occurance char index are same then we can say that it appears once's
                // If character appears only once, append to result
                result.append(current);
            }
        }

        // Print the result containing only non-repeated characters
        System.out.println("String with non-repeated characters: " + result);
    }
}
