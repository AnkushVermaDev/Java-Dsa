public class StringDemo {

    public static void main(String[] args) {

        // Working with Strings
        String str = "ahello mahila mitr";
        String str2 = "Bhello";

        // Displaying a specific character at index 1 (zero-based indexing)
        System.out.println("Character at index 1 in str: " + str.charAt(1)); // Output: 'h'

        // Unicode value of character at index 0 in str2
        System.out.println("Unicode value of the character at index 0 in str2: " + str2.codePointAt(0)); // Output: 66

        // Substring excluding the last character
        System.out.println("Substring of str excluding the last character: " + str.substring(0, str.length() - 1)); // Output: "ahello mahila mit"

        // Lexicographical comparison between str and str2
        System.out.println("Comparison of str and str2: " + str.compareTo(str2)); 
        // Explanation: Compares based on ASCII values. If str < str2, returns negative; if str > str2, returns positive; if equal, returns 0.

        // Checking if str ends with a specific character
        System.out.println("Does str end with 'r'?: " + str.endsWith("r")); // Output: true

        // Checking if str contains a specific sequence
        System.out.println("Does str contain 'mitr'?: " + str.contains("mitr")); // Output: true

        // Replacing a substring with another string
        System.out.println("Replacing 'mahila' with str2 in str: " + str.replace("mahila", str2)); // Output: "ahello Bhello mitr"

        // Replacing the entire string with another string
        System.out.println("Replacing entire str with str2: " + str.replaceAll(str, str2)); // Output: "Bhello"

        // Additional String Methods
        
        // Convert to uppercase
        System.out.println("Uppercase of str: " + str.toUpperCase()); // Output: "AHELLO MAHILA MITR"

        // Convert to lowercase
        System.out.println("Lowercase of str2: " + str2.toLowerCase()); // Output: "bhello"

        // Trim leading and trailing spaces (if any)
        String strWithSpaces = "   Hello World   ";
        System.out.println("Trimmed String: " + strWithSpaces.trim()); // Output: "Hello World"

        // Checking if a string is empty
        String emptyString = "";
        System.out.println("Is the string empty?: " + emptyString.isEmpty()); // Output: true

        // Checking the length of a string
        System.out.println("Length of str: " + str.length()); // Output: 18

        // Splitting a string
        String[] words = str.split(" ");
        System.out.println("Words in str:");
        for (String word : words) {
            System.out.println(word);
        }

        ///////////////////////// StringBuilder

        StringBuilder sb = new StringBuilder();

        // Appending strings to StringBuilder
        sb.append("sexy");
        sb.append(" bitch");
        System.out.println("StringBuilder after append: " + sb); // Output: "sexy bitch"

        // Deleting characters from index 0 to 1 (exclusive)
        sb.delete(0, 1);
        System.out.println("StringBuilder after delete: " + sb); // Output: "exy bitch"

        // Inserting a string at a specific index
        sb.insert(0, "r");
        System.out.println("StringBuilder after insert: " + sb); // Output: "rexy bitch"

        // Accessing a specific character
        System.out.println("Character at index 0 in StringBuilder: " + sb.charAt(0)); // Output: 'r'

        // Unicode value of character at index 0
        System.out.println("Unicode value of character at index 0 in StringBuilder: " + sb.codePointAt(0)); // Output: 114

        // Length of StringBuilder
        System.out.println("Length of StringBuilder: " + sb.length()); // Output: 10

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb); // Output: "hctib yxer"

        // Clearing the StringBuilder (reset to empty)
        sb.setLength(0);
        System.out.println("StringBuilder after clearing: " + sb); // Output: ""
    }
}
