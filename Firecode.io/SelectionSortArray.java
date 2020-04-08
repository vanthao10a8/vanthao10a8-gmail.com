
public class SelectionSortArray {
    /**
     *  Selection sort offers improved performance over bubble sort, especially for arrays with a large number of elements. 
     *  Where bubble sort accumulated the largest elements towards the end of the array, 
     *  selection sort accumulates the smallest elements at the beginning of the array.
        Write a method that uses the selection sort algorithm to sort an input array of integers. 
        See the hints and click the red colored links for additonal details on the algorithm.
     */
    public static int[] selectionSortArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}