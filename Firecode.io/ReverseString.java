
public class ReverseString {
    /**
     * Write a method that takes in a String and returns the reversed version of the String.
     * Examples:
        reverseString("abcde") -> "edcba"
        reverseString("1") -> "1"
        reverseString("") -> ""
        reverse("madam") -> "madam"
        reverse(null) -> null
     */
    public static String reverseString(String str){
        if (str == null) return null;
        if (str.isEmpty()) return str;
        return reverseString (str.substring(1)) + str.charAt(0);
    }
}