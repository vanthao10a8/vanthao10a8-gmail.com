public class ReplaceSpace {
    /**
     * Write a method to replace all spaces in a string with a given replacement string.
     * replace("This is a test","/") --> "This/is/a/test"
     */
    public static String replace(String a, String b) {
        // Solution : 1
            // String[] strs = a.split(" ");
            // return String.join(b, strs);
            
        // Solution : 2
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()){
            if(' ' != c)
                sb.append(c);
            else 
                sb.append(b);
        }
        return sb.toString();
    }
}