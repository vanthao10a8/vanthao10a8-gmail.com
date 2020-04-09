
public class IsIntPalindromeNumber {
    /**
     * Write a method that checks if a given integer is a palindrome - without allocating additional heap space
     */
    public static Boolean isIntPalindrome(int a) {            
        int x = a;
        int r = 0;
    
        if(x < 0)
            return false;
            
        while(x > 0){
            int temp = x % 10;
            x = x / 10;
            r = (r * 10) + temp;
        }
        if(r == a)
            return true;
        else return false;
    }
}