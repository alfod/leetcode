package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/5.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] verify = new int[10];
        char[] array = new char[9];
        boolean result;
        for (int i = 0; i < board.length; i++) {
            reset(verify);
            result = valid(board[i], verify);
            if (!result) {
                return result;
            }

            for (int i1 = 0; i1 < board.length; i1++) {
                array[i1] = board[i1][i];
            }
            reset(verify);
            result = valid(array, verify);
            if (!result) {
                return result;
            }

        }

        int xLength = 3, yLength = 3;
        int xAxle, yAxle;
        int index;

        for (int x = 0; x < board.length / 3; x++) {
            for (int y = 0; y < board[x].length / 3; y++) {
                xAxle = 3 * x;
                yAxle = 3 * y;
                index = 0;
                for (int i = xAxle; i < xAxle + xLength; i++) {
                    for (int j = yAxle; j < yAxle + yLength; j++) {
                        array[index] = board[i][j];
                        index++;
                    }
                }
                result = valid(array, reset(verify));
                if (!result) {
                    return result;
                }
            }
        }

        return true;
    }

    private boolean valid(char[] array, int[] verify) {
        int value;
        for (char c : array) {
            value = c - '0';
            if (value > 0 && value < 10) {
                if (verify[value] != 1) {
                    verify[value] = 1;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private int[] reset(int[] verify) {
        for (int i = 0; i < verify.length; i++) {
            verify[i] = 0;
        }
        return verify;
    }
}
