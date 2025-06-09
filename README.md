# 🎮 Tic Tac Toe (LLD in Java)

Welcome to a clean, object-oriented implementation of **Tic Tac Toe** using Java.  
This project is designed to demonstrate **low-level design principles** like SOLID, modularity, and extensibility.

> ✅ Ideal for interview prep and backend system design practice.

---

## 🚀 Features

- ✅ Fully playable NxN Tic Tac Toe (default 3x3)
- 🎯 Clean architecture using OOP
- 🔁 Pluggable strategy pattern for win logic
- ❌ Handles invalid moves (occupied cell, out-of-bounds)
- 💡 Easily extensible (AI, replay, GUI)

---

## 🧠 Key Concepts Covered

| Concept             | Used In                         |
|---------------------|---------------------------------|
| SOLID Principles     | Board, Game, Cell, Strategy     |
| Strategy Pattern     | Win-checking logic              |
| Object Modeling      | Players, Moves, Cells           |
| Turn-based Flow      | Game state machine              |
| Input Validation     | Console interaction             |

---

## 📂 Project Structure

tic-tac-toe-LLD/
├── model/                 # Core entities (Player, Cell, Board)
│   ├── Player.java
│   ├── Cell.java
│   ├── Board.java
│   └── Symbol.java
├── service/               # Game engine (controls turn logic)
│   └── Game.java
├── strategy/              # Win-checking logic
│   ├── WinningStrategy.java
│   └── DefaultWinningStrategy.java
└── Main.java              # Entry point with CLI interaction

---

## 🧪 How to Run Locally

### 📦 Requirements
- Java 11+ installed
- IDE (like IntelliJ) or terminal

### 💻 Run via Terminal
javac src/**/*.java  
java -cp src Main

---

## 🕹️ Sample CLI Output

Welcome to Tic Tac Toe!  
Enter board size (N for NxN): 3  
Enter Player 1 name: Alice  
Enter Player 2 name: Bob

Alice's turn (X)  
Enter row and column (0-based): 0 0

Bob's turn (O)  
Enter row and column (0-based): 1 1  
...  
🎉 Alice wins!

---

## 🔧 Want to Extend It?

- 🤖 Add an AI player using Minimax
- 🕸️ Add a Web UI using Spring Boot + Thymeleaf
- 🧵 Add Undo/Redo (move history)
- 🧪 Add Unit Tests with JUnit
- 🔄 Multiplayer network support

---

## 📚 Learning Goals

If you're a developer:
- Understand how to break a game into clean classes
- Practice modular Java design
- Learn Strategy Pattern with real-world use
- Sharpen your LLD interview skills

---

## 👨‍💻 Author

Subramanyam Adimulam  
📧 subbu.adimulam08@gmail.com  
🔗 https://www.linkedin.com/in/subramanyam-adimulam  
🏢 GitHub Org: https://github.com/subu-design-lab

---

“Simple systems, when designed cleanly, reveal the mind of a great engineer.”