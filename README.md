# 🔐 The Vault Cracker

A hacker-themed number guessing game built in Java.
You play as an operative trying to crack a vault code before security locks you out.

---

## 🎮 How to Play

1. Run the program
2. Choose your breach level (difficulty)
3. Guess the secret vault code within the allowed attempts
4. The game tells you if your guess is too high or too low
5. Crack the code before you run out of attempts to score points

---

## 🕹️ Difficulty Levels

| Level | Range | Attempts | Base Score |
|-------|-------|----------|------------|
| ROOKIE | 1 - 50 | 10 | 100 |
| OPERATIVE | 1 - 100 | 7 | 200 |
| GHOST | 1 - 200 | 5 | 300 |

---

## 🧮 Scoring

- Your score is calculated based on difficulty and attempts used
- Formula: `Base Score - (Attempts Used × 10)`
- Score never goes below 0
- Failed attempts result in a score of 0

---

## 🛠️ Built With

- Java
- Maven
- IntelliJ IDEA

---

## 🚀 How to Run

1. Clone the repository:

git clone https://github.com/sthabisoxakaza52/vault-cracker-java.git

2. Open the project in IntelliJ IDEA
3. Run `VaultCracker.java`

---

## 👩🏾‍💻 Author

Sthabiso Xakaza
WeThinkCode_ — Cape Town
[GitHub](https://github.com/sthabisoxakaza52)