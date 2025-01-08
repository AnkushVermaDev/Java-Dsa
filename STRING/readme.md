charAt(1):
   Retrieves the character at the specified index (1 in this case).

codePointAt(0):
  Returns the Unicode code point of the character at the specified index.


substring(0, str.length() - 1):
  Extracts a substring starting at the first index (0) and ending before the last index (str.length() - 1). NOTE: we can only do like that lower index to higher index. IF we try to do like: first writing higher index then lower index then it will show error

compareTo(str2):
  Compares two strings lexicographically (based on Unicode values).
  Returns:
   Negative if the current string is less than str2.
   Positive if greater.
   Zero if equal.


endsWith("r"):
   Checks if the string ends with the specified suffix.

contains("mitr"):
  Checks if the string contains the specified sequence of characters.

replace("mahila", str2):
  Replaces all occurrences of the specified substring ("mahila") with another string (str2).

replaceAll(str, str2):
  Replaces the entire string with another string.


toUpperCase():
   Converts all characters in the string to uppercase.


toLowerCase():
  Converts all characters in the string to lowercase.

trim():
  Removes leading and trailing whitespace.

isEmpty():
  Checks if the string is empty.

length():
  Returns the number of characters in the string.

split(" "):
  Splits the string into an array based on the specified delimiter (space in this case).



                                       StringBuilder Methods

append("sexy"):
  Adds the specified string to the end of the StringBuilder.


delete(0, 1):
  Removes characters from the start index (inclusive) to the end index (exclusive).


deleteCharAt(int index):
     remove any character form specific index number depends upon the parameter provided inside the round brackets.

insert(0, "r"):
  Inserts the specified string at the given index.

charAt(0):
  Retrieves the character at the specified index.

codePointAt(0):
  Returns the Unicode code point of the character at the specified index.

length():
  Returns the current length (number of characters) in the StringBuilder.


reverse():
  Reverses the sequence of characters in the StringBuilder.

setLength(0):
  Resets the StringBuilder to an empty state by setting its length to 0.

SetCharAt(int index , Value):
     insert any character at specific index number depends upon the parameter provided inside the round brackets.

