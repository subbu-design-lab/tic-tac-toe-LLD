package org.designlab.strategy;

import org.designlab.model.Board;
import org.designlab.model.Cell;
import org.designlab.model.Player;

/**
 * Author: subramanyamadimulam
 * Date: 05/06/25
 */

public class DefaultWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Player player, int row, int column) {
        int size = board.getSize();
        Cell[][] grid = board.getGrid();

        //Check Row win
        boolean rowWon = true;
        for (int i = 0; i < size; i++) {
            if (grid[row][i].getPlayer() != player) {
                rowWon = false;
                break;
            }
        }

        //Check Column win
        boolean columnWon = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][column].getPlayer() != player) {
                columnWon = false;
                break;
            }
        }

        //Check Diagonal win Top-left to bottom-right
        boolean diagonalWon = true;
        if (row == column) {
            for (int i = 0; i < size; i++) {
                if (grid[i][i].getPlayer() != player) {
                    diagonalWon = false;
                    break;
                }
            }
        } else {
            diagonalWon = false;
        }

        //Check Diagonal win Top-right to bottom-left
        boolean antiDiagonalWon = true;
        if (row + column == size - 1) {
            for (int i = 0; i < size; i++) {
                if (grid[i][size -1 -i].getPlayer() != player) {
                    antiDiagonalWon = false;
                    break;
                }
            }
        } else {
            antiDiagonalWon = false;
        }

        return rowWon || columnWon || diagonalWon || antiDiagonalWon;
    }
}
