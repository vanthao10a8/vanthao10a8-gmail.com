import java.util.*;
public class SingleNumber {
    /**
     *  Write a method that returns a number that appears only once in an array.
        Assume the array will surely have a unique value. The array will never be empty.
        Examples:
            {1,2,3,4,1,2,4,3,5} ==> 5
     */
    public static int singleNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }
}