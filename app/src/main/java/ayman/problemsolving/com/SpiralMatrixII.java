package ayman.problemsolving.com;

public class SpiralMatrixII {

    public static void main(String... args) {
        int[][] result = generateMatrix(3);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int counter = 0;

        int leftToRightPointer = 0;
        int topToBottomPointer = n - 1;
        int rightToLeftPointer = n - 1;
        int bottomToTopPointer = 0;

        while (counter != n*n) {
            for (int i = leftToRightPointer; i <= topToBottomPointer; i++) {
                result[leftToRightPointer][i] = ++counter;
            }
            leftToRightPointer++;
            if (counter > n*n) break;

            for (int i = leftToRightPointer; i <= rightToLeftPointer; i++) {
                result[i][topToBottomPointer] = ++counter;
            }
            topToBottomPointer--;
            if (counter > n*n) break;

            for (int i = topToBottomPointer; i >= bottomToTopPointer; i--) {
                result[rightToLeftPointer][i] = ++counter;
            }
            rightToLeftPointer--;
            if (counter > n*n) break;

            for (int i = rightToLeftPointer; i >= leftToRightPointer; i--) {
                result[i][bottomToTopPointer] = ++counter;
            }
            bottomToTopPointer++;
        }
        return result;
    }

}
