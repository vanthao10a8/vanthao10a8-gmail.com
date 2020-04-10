import java.util.*;

public class RemoveDuplicates {
    /**
     * Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words.
     * The returned ArrayList should be lexically alphabetically.
     */
    public static ArrayList<String> removeDuplicates(List<String> input) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(input);
        ArrayList<String> arr = new ArrayList<>(treeSet);
        return arr;
    }
}