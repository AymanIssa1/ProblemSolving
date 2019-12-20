package ayman.problemsolving.com;

public class ReshapeTheMatrix {

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/

    public static void main(String... args) {
        int[][] nums = new int[][]{
                {1, 2},
                {3, 4}
        };

        for (int[] arr : matrixReshape(nums,1,4)) {
            for (int num : arr){
                System.out.print(num + ", ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int sizeOfElements = nums.length * nums[0].length;
        int sizeOfRequestedMatrix = r * c;

        if (sizeOfElements != sizeOfRequestedMatrix)
            return nums;


        int[][] reshapeMatrix = new int[r][c];

        int row = 0;
        int column = 0;

        for (int[] arr : nums) {
            for (int num : arr) {
                reshapeMatrix[row][column] = num;
                column++;
                if (c == column) {
                    column = 0;
                    row++;
                }
            }
        }

        return reshapeMatrix;
    }

}
