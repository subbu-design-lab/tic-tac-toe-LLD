package org.designlab.model;

/**
 * Author: subramanyamadimulam
 * Date: 05/06/25
 */

public class Board {

    private final int size;
    private final Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean isCellEmpty(int x, int y) {
        return grid[x][y].isEmpty();
    }

    public void makeMove(int x, int y, Player player) {
        grid[x][y].setPlayer(player);
    }

    public void printBoard() {
        for (Cell[] row : grid) {
            for (Cell cell : row) {
                System.out.print(cell.display() + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public Cell[][] getGrid() {
        return grid;
    }
}
