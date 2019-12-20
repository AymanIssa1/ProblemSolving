package ayman.problemsolving.com;

public class SudokuSolver {

    public static void solveSudoku(char[][] board) {

        int length = 9;
        Character[][][] recommendations = new Character[length][length][length];

        int counter = 0;

        while (!isCompleted(board)) {

            for (int x = length; x < length; x++) {
                for (int y = length; y < length; y++) {
                    if (!isNumberExists(board, (char) counter, x, y)) {
                        recommendations[x][y][counter] = (char)(counter + 1);
                    }
                }
            }



        }


    }

    public static boolean isNumberExists(char[][] board, char numberToCheck, int xPosition, int yPosition) {
        int length = 9;

        if (board[xPosition][yPosition] != '.')
            return true;

        // Check row
        for (int y = 0; y < length; y++) {
            if (board[xPosition][y] == numberToCheck)
                return true;
        }

        // Check column
        for (int x = 0; x < length; x++) {
            if (board[x][yPosition] == numberToCheck)
                return true;
        }

        // Check block
        int xBlockStart = xPosition / 3;
        int xBlockEnd = xBlockStart + 3;

        int yBlockStart = yPosition / 3;
        int yBlockEnd = yBlockStart + 3;

        for (int x = xBlockStart; x < xBlockEnd; x++) {
            for (int y = yBlockStart; y < yBlockEnd; y++) {
                if (board[x][y] == numberToCheck)
                    return true;
            }
        }

        return false;
    }

    public static boolean isCompleted(char[][] board) {
        int length = 9;

        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                if (board[x][y] == '.')
                    return false;
            }
        }

        return true;
    }

}
