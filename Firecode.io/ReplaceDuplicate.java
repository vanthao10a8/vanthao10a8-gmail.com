import java.util.*;

public class ReplaceDuplicate {
    /**
     *  Write a method duplicate to find the repeated or duplicate elements in an array.
        This method should return a list of repeated integers in a string with the elements sorted 
        in ascending order (as illustrated below).
     */
    public static String duplicate(int[] numbers){
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num : numbers){
            if(!set.add(num)){
                answer.add(num);
            }
        }
        return answer.toString();
    }
}