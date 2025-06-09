package org.designlab;

import org.designlab.model.Board;
import org.designlab.model.Player;
import org.designlab.model.Symbol;
import org.designlab.service.Game;
import org.designlab.strategy.DefaultWinningStrategy;
import org.designlab.strategy.WinningStrategy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎮 Welcome to Tic Tac Toe!");
        System.out.print("Enter board size (N for NxN): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Get player 1
        System.out.print("Enter Player 1 name: ");
        String name1 = scanner.next();
        Player player1 = new Player(name1, Symbol.X);
        scanner.nextLine();

        // Get player 2
        System.out.print("Enter Player 2 name: ");
        String name2 = scanner.next();
        Player player2 = new Player(name2, Symbol.O);
        scanner.nextLine();

        // Initialize game components
        Board board = new Board(size);
        List<Player> players = List.of(player1, player2);
        WinningStrategy strategy = new DefaultWinningStrategy();

        Game game = new Game(board, players, strategy);

        // Start the game
        game.play();
    }
}