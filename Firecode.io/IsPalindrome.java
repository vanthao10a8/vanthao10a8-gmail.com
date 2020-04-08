
public class IsPalindrome {
    /**
     * A palindrome is a string or sequence of characters that reads the same backward as forward.
     * Examples:
        isStringPalindrome("madam") -> true
     */
    public static boolean isStringPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}