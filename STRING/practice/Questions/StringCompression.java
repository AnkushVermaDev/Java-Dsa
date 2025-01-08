import java.util.Arrays;

public class StringCompression {
    public static void main(String args[]) {
        char chars[] = { 'a', '5', 'a', 'b', 'c', 'b' };

        // variables and other declarations

        int counter = 1;
        int index = 0;
        int startLoc = 2 * index + 1;

        StringBuffer mylist = new StringBuffer();
        String seen_list = "";

        // main implementations for inserttion

        for (int i = 0; i < chars.length - 1; i++) {
            counter = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {

                    counter++;

                }

            }

            if (seen_list.contains(String.valueOf(chars[i])) == false) {

                mylist.append(String.valueOf(chars[i])).append(String.valueOf(counter));

            }

            seen_list = seen_list + chars[i];

        }



        // Convert the cleaned string to a char array


        String cleanedString = mylist.toString().replaceAll("\\s+", "");
        char[] listing = cleanedString.toCharArray();
        int increase = 0;


        for (int i = 0; i < listing.length; i++) {

            boolean check_aphabets = Character.isLetter(listing[i]);

            if (check_aphabets) {

                increase++;

            }

        }
        System.out.println(listing);

        System.out.println(increase);

    }
}
