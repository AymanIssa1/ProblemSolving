package ayman.problemsolving.com;

public class TransposeMatrix {

    // https://leetcode.com/problems/transpose-matrix/description/

    public static void main(String... args){
        int [][] x = new int[3][3];
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;

        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

        int[][] y = transpose(x);
        for (int[] k : y){
            for (int n : k){
                System.out.print(n + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0;j < A[i].length;j++){
                result[j][i] = A[i][j];
            }
        }


        return result;
    }

}
