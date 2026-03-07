# 🎮 Guessor Game (Java)

A simple **console-based Java game** where one person acts as the **Guessor** and multiple players attempt to **predict the guessed number**.
An **Umpire** manages the game by collecting the numbers from the guessor and the players, then deciding the winner.

This project demonstrates basic **Object-Oriented Programming (OOP)** concepts in Java such as **classes, objects, methods, and interaction between different classes**.

---

# 🧠 Game Concept

The game involves three main roles:

### 1️⃣ Guessor

The guessor secretly chooses a number.

### 2️⃣ Players

Five players try to predict the number chosen by the guessor.

### 3️⃣ Umpire

The umpire collects all the guesses and determines which player guessed correctly.

---

# 🏗 Project Structure

```
Guessor-Game
│
├── bin
│   ├── Guessor.class
│   ├── GuessorGameApp.class
│   ├── Main.class
│   ├── Player.class
│   └── Umpire.class
│
├── GuessorGameApp.java
└── README.md
```

### Explanation

* **bin/** → Contains compiled Java bytecode (`.class` files)
* **GuessorGameApp.java** → Main source file containing all classes
* **README.md** → Documentation of the project

---

# 🧩 Classes Used

## GuessorGameApp

* Contains the **main() method**
* Starts the game
* Creates an object of the **Umpire class**

## Guessor

* Allows the guessor to enter a number.

## Player

* Allows players to predict the number guessed by the guessor.

## Umpire

* Collects numbers from the guessor and players
* Compares all numbers
* Declares the winner

---

# ⚙️ How the Game Works

1. The guessor enters a number.
2. Each player predicts a number.
3. The umpire collects all numbers.
4. The umpire compares the guessor’s number with the players’ guesses.
5. If a player's guess matches the guessor’s number → that player wins.
6. If no one guesses correctly → no winner is declared.

---

# ▶️ How to Run the Project

### 1️⃣ Compile the program

```
javac -d bin GuessorGameApp.java
```

This command compiles the program and stores the **.class files inside the bin folder**.

### 2️⃣ Run the program

```
java -cp bin GuessorGameApp
```

---

# 🖥 Example Output

```
Guessor ! kindly guess any number
45

Player 1 ! kindly predict the number from 1 to 100
23

Player 2 ! kindly predict the number from 1 to 100
45

Player 3 ! kindly predict the number from 1 to 100
67

Player 4 ! kindly predict the number from 1 to 100
12

Player 5 ! kindly predict the number from 1 to 100
89

Congratulations player2 you have won the game
```

---

# 📚 Concepts Used

* Java Classes and Objects
* Methods
* Scanner class for input
* Conditional statements (`if-else`)
* Interaction between multiple classes

---

# 🚀 Possible Improvements

This project can be enhanced with:

* Random number generation using `Random`
* Dynamic number of players
* Input validation
* Loop-based player guessing system
* Graphical user interface using **Java Swing or JavaFX**
* Leaderboard or score tracking

---

# 👨‍💻 Author

**Akash Wakade**

B.Tech Computer Science student exploring **Java, Web Development, and Open Source Development**.
