public class FlipItVerticalAxis{
    /*
    You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.
    Example:
    Input image :  
                1 0
                1 0

    Modified to :   
                0 1
                0 1
    */
    public static void flipItVerticalAxis(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = temp;
            }
        }
    }
}