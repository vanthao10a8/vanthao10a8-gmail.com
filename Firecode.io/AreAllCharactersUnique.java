import java.util.HashSet;
import java.util.Set;

public class AreAllCharactersUnique {
    /**
     *  Write a method that takes in an input String and returns true if all the characters in the String are unique and false if there is even a single repeated character.
        The method should return true if the input is null or empty String.
        Examples:
            areAllCharactersUnique("abcde") -> true
            areAllCharactersUnique("aa") -> false
            areAllCharactersUnique("") -> true
            areAllCharactersUnique(null) -> true
     */
    public static boolean areAllCharactersUnique(String str){
        if(str == null || str.isEmpty())
            return true;
        char[] strs = str.toCharArray();
        Set<Character> setStr = new HashSet<>();
        for(char c : strs){
            if(!setStr.add(c))
                return false;
        }
        return true;
    }
}