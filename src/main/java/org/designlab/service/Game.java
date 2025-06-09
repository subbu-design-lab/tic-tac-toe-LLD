package org.designlab.service;

import org.designlab.model.Board;
import org.designlab.model.Player;
import org.designlab.strategy.WinningStrategy;

import java.util.List;
import java.util.Scanner;

/**
 * Author: subramanyamadimulam
 * Date: 05/06/25
 */

public class Game {

    private Board board;
    private List<Player> players;
    private WinningStrategy winningStrategy;
    private int currentPlayerIndex;
    private boolean gameOver;

    public Game(Board board, List<Player> players, WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.winningStrategy = winningStrategy;
        this.currentPlayerIndex = 0;
        this.gameOver = false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int moveCount = 0;
        int totalMoves = board.getSize() * board.getSize();
        while (!gameOver && moveCount < totalMoves) {
            board.printBoard();

            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.name() + "'s turn (" + currentPlayer.symbol() + ")");

            int row = -1, col = -1;
            boolean validMove = false;
            while (!validMove) {
                System.out.print("Enter row and column (0-based): ");
                row = scanner.nextInt();
                scanner.nextLine();
                col = scanner.nextInt();
                scanner.nextLine();
                if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
                    System.out.println("Invalid coordinates. Try again.");
                } else if (!board.isCellEmpty(row, col)) {
                    System.out.println("Cell already occupied. Try again.");
                } else {
                    validMove = true;
                }
            }

            board.makeMove(row, col, currentPlayer);
            moveCount++;
            if (winningStrategy.checkWinner(board, currentPlayer, row, col)) {
                board.printBoard();
                System.out.println("🎉 " + currentPlayer.name() + " wins!");
                gameOver = true;
                return;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        board.printBoard();
        System.out.println("⚖️ It's a draw!");
    }

}
