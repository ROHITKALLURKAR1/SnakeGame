# 🐍 Snake Game - Java Swing

A simple classic **Snake Game** built using **Java Swing** and Java's `Graphics` API.

This project was created to practice Java GUI programming, keyboard events, game loops, arrays, collision detection, and basic game logic.

## 🎮 Features

* Snake moves automatically
* Arrow-key controls
* Snake cannot immediately reverse direction
* Random food generation
* Snake grows after eating food
* Score increases when food is eaten
* Wall collision detection
* Game Over dialog
* Restart option after Game Over
* Exit option after Game Over

## 🕹️ Controls

| Key            | Action     |
| -------------- | ---------- |
| ⬆️ Up Arrow    | Move Up    |
| ⬇️ Down Arrow  | Move Down  |
| ⬅️ Left Arrow  | Move Left  |
| ➡️ Right Arrow | Move Right |

## 🧠 Concepts Used

This project uses several core Java concepts:

* Java Swing
* `JFrame` and `JPanel`
* `Graphics`
* `Timer`
* `ActionListener`
* `KeyListener`
* Arrays
* Loops
* Conditional statements
* Random number generation
* Collision detection
* Object-oriented programming

## 📁 Project Structure

```text
SnakeGame/
│
├── Game.java
├── GamePanel.java
└── README.md
```

### `Game.java`

Creates the main game window and adds the game panel.

### `GamePanel.java`

Contains the main game logic, including:

* Snake movement
* Keyboard controls
* Snake body
* Food generation
* Score
* Collision detection
* Game Over
* Restart logic

## ▶️ How to Run

Make sure Java is installed on your computer.

Compile the files:

```bash
javac Game.java GamePanel.java
```

Run the game:

```bash
java Game
```

## 🎯 Game Rules

1. Control the snake using the arrow keys.
2. Eat the red food to increase your score.
3. The snake grows whenever it eats food.
4. Avoid hitting the walls.
5. When the game ends, you can restart or exit.

## 🚀 Possible Future Improvements

* Self-collision detection
* High-score system
* Start menu
* Pause/resume feature
* Difficulty levels
* Better graphics and colors
* Sound effects
* Increasing speed as the score increases
* Food spawning based on the exact panel size

## 🛠️ Technologies

* Java
* Java Swing
* AWT Graphics

## 📚 Purpose

This project was built as a learning project to understand the fundamentals of creating a simple 2D game in Java without using a game engine.
