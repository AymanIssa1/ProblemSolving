package ayman.problemsolving.com;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static void main(String... args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.print(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int length = 9;
        Set<Character> checker = new HashSet<>();

        // Check Horizantal lines
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                if (board[x][y] != '.') {
                    if (checker.contains(board[x][y]))
                        return false;
                    checker.add(board[x][y]);
                }
            }
            checker.clear();
        }

        // Check Vertical lines
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < length; x++) {
                if (board[x][y] != '.') {
                    if (checker.contains(board[x][y]))
                        return false;
                    checker.add(board[x][y]);
                }
            }
            checker.clear();
        }

        int boxX = 3;
        int boxY = 0;


        while (boxX < length + 1 && boxY < length + 1) {
            boxY += 3;
            if (boxY == 12) {
                boxY = 3;
                boxX += 3;
            }

            if (boxX > length)
                break;

            // Check Horizantal lines
            for (int x = boxX - 3; x < boxX; x++) {
                for (int y = boxY - 3; y < boxY; y++) {
                    if (board[x][y] != '.') {
                        if (checker.contains(board[x][y]))
                            return false;
                        checker.add(board[x][y]);
                    }
                }
            }
            checker.clear();
        }

        return true;
    }

}
