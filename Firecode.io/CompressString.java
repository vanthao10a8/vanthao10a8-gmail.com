import java.util.*;

public class CompressString {
    /**
     * Compress a sorted String by replacing instances of repeated characters 
     * with the character followed by the count of the character.
        compressString("aaabbbbbcccc") --> a3b5c4
        compressString("aabbbbccc") --> a2b4c3
        compressString("abc") --> abc
     */
    public static String compressString(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = text.toCharArray();
        for(char c : arr)
            if(map.get(c) == null)
                map.put(c, 1);
            else 
                map.put(c, map.get(c) + 1);
        String answer = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            answer += entry.getKey();
            if(entry.getValue() != 1)
                answer += entry.getValue();
        }
        return answer;
    }
}