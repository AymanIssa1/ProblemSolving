package ayman.problemsolving.com;

public class FlippingAnImage {

    //https://leetcode.com/problems/flipping-an-image/description/

    public static void main(String... args){
        int[][] A = new int[3][3];
        A[0][0] = 1;
        A[0][1] = 1;
        A[0][2] = 0;

        A[1][0] = 1;
        A[1][1] = 0;
        A[1][2] = 1;

        A[2][0] = 0;
        A[2][1] = 0;
        A[2][2] = 0;

        flipAndInvertImage(A);
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] flippedArray = new int[A.length][A[0].length];

        int outerArrayLength = 0;
        int innerArrayLength = 0;

        for (int i = 0; i < A.length ; i++) {
            for (int j = A[0].length - 1; j >= 0; j--) {
                flippedArray[outerArrayLength][innerArrayLength] = A[i][j];
                innerArrayLength++;
            }
            innerArrayLength = 0;
            outerArrayLength++;
        }

        for (int i = 0; i < flippedArray.length; i++) {
            for (int j = 0; j < flippedArray[0].length; j++) {
                if (flippedArray[i][j] == 0)
                    flippedArray[i][j] = 1;
                else
                    flippedArray[i][j] = 0;
            }
        }

        return flippedArray;
    }
}
