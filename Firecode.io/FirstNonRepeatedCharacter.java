import java.util.*;

/**
 * Find the first non-duplicate character in a string. Return null if no unique character is found.
    firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
    firstNonRepeatedCharacter( "cbcd" ) --> 'b'
    firstNonRepeatedCharacter( "cdcd" ) --> null
 */
public class FirstNonRepeatedCharacter {
    public static Character firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] strs = str.toCharArray();
        for(char s : strs){
            if(map.get(s) == null){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1 );
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1 )
                return entry.getKey();
        }
        return null;
    }
}