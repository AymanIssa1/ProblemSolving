package ayman.problemsolving.com;

public class ToeplitzMatrix {

    // https://leetcode.com/problems/toeplitz-matrix

    public static void main(String... args) {

//        int[][] matrix = new int[3][4];
//        matrix[0] = new int[]{1,2,3,4};
//        matrix[1] = new int[]{5,1,2,3};
//        matrix[2] = new int[]{9,5,1,2};


        int[][] matrix = new int[][]{
                {0 ,33,98},
                {34,22,33}
        };

        System.out.println(isToeplitzMatrix(matrix));

    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int index = 1;
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("column: " + i);
            int rowPosition = matrix.length-1;
            int value = matrix[rowPosition][index-1];
            for (int j = index-1; j >= 0; j--) {
                System.out.println("value = " + value + ", x = " + matrix[rowPosition][j] + ", row = " + rowPosition + ", j= " + j);
                if (value != matrix[rowPosition][j])
                    return false;

                if (rowPosition == 0)
                    break;

                rowPosition--;
            }
            index++;
        }

        index = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("row: " + i);
            int columnPosition = matrix[0].length -1;
            int value = matrix[index-1][columnPosition];
            for (int j = index -1; j >=0 ; j--){
                System.out.println("value = " + value + ", x = " + matrix[j][columnPosition] + ", column = " + columnPosition + ", j= " + j);
                if (value != matrix[j][columnPosition])
                    return false;


                if (columnPosition == 0)
                    break;

                columnPosition--;
            }
            index--;
        }


        return true;
    }

}
