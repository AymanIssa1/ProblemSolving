package ayman.problemsolving.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

    public static void main(String... args) {
        int[][] x = new int[][]{{1, 2,  3,   4},
                                {5, 6,  7,   8},
                                {9, 10, 11, 12}};
        List<Integer> spiralList = spiralOrder(x);
        System.out.println(Arrays.toString(new List[]{spiralList}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int lengthX = matrix.length;
        int lengthY = matrix[0].length;

        int leftToRightPointer = 0;
        int topToBottomPointer = lengthY - 1;
        int rightToLeftPointer = lengthX - 1;
        int bottomToTopPointer = 0;

        while (result.size() != lengthX * lengthY) {

            for (int i = leftToRightPointer; i <= topToBottomPointer; i++) {
                result.add(matrix[leftToRightPointer][i]);
            }
            leftToRightPointer++;
            if (result.size() == lengthX * lengthY) break;

            for (int i = leftToRightPointer; i <= rightToLeftPointer; i++) {
                result.add(matrix[i][topToBottomPointer]);
            }
            topToBottomPointer--;
            if (result.size() == lengthX * lengthY) break;

            for (int i = topToBottomPointer; i >= bottomToTopPointer; i--) {
                result.add(matrix[rightToLeftPointer][i]);
            }
            rightToLeftPointer--;
            if (result.size() == lengthX * lengthY) break;

            for (int i = rightToLeftPointer; i >= leftToRightPointer; i--) {
                result.add(matrix[i][bottomToTopPointer]);
            }
            bottomToTopPointer++;

        }

        return result;
    }

}
