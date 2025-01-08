public class stringssjav {
 
public static void main(String args[]) {
    

    String ch[] = { "a", "a", "b", "c", "b", "b", "s", "o" };

StringBuffer stb = new StringBuffer();

// Append characters to StringBuffer
for (int i = 0; i < ch.length; i++) {
    stb.append(ch[i]);
}

// Remove duplicate characters
for (int i = 0; i < stb.length() - 1; i++) {
    for (int j = i + 1; j < stb.length(); j++) { // Start from i+1
        if (stb.charAt(i) == stb.charAt(j)) {
            stb.delete(j, j + 1); // Delete the duplicate character
            j--; // Adjust j after deletion to recheck the current index
        }
    }
}

// Print the result
System.out.println(stb.toString());

}


}