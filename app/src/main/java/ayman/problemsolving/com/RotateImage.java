package ayman.problemsolving.com;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int firstLayer = 0; firstLayer < n / 2; firstLayer++) {
            int lastLayer = n - 1 - firstLayer;
            for (int i = firstLayer; i < lastLayer; i++) {
                int offset = i - firstLayer;

                int top = matrix[firstLayer][i]; // save top

                // left -> top
                matrix[firstLayer][i] = matrix[lastLayer-offset][firstLayer];

                // bottom -> left
                matrix[lastLayer-offset][firstLayer] = matrix[lastLayer][lastLayer - offset];

                // right -> bottom
                matrix[lastLayer][lastLayer - offset] = matrix[i][lastLayer];

                //top -> right
                matrix[i][lastLayer] = top;
            }
        }
    }

}
