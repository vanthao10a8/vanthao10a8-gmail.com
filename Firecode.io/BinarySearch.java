
public class BinarySearch {
    /**
     *  Write a method that searches an Array of integers for a given integer using the
        Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
        You can assume that the given array of integers is already sorted
        in ascending order.
        Examples:
            binarySearch({2,5,7,8,9},9) -> true
            binarySearch({2,8,9,12},6) -> false
            binarySearch({2},4) -> false
            binarySearch({},9) -> false
            {} -> [Empty] Array
     */
    public static Boolean binarySearch(int[] arr, int n){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;
            
            if (arr[m] == n) 
                return true;
    
            if (arr[m] < n) 
                l = m + 1;
            else
                r = m - 1; 
        }
        return false;
    }
}