# ATM Console Application 

## 📌 Project Overview
This project is a **Core Java console-based ATM simulation** designed to demonstrate **object-oriented programming (OOP) concepts** and backend logic.  
It simulates basic ATM functionalities such as PIN validation, balance inquiry, deposit, withdrawal, and mini statement generation.

The project focuses on **clarity of logic, clean design, and strong Java fundamentals**, making it suitable as an academic mini-project and for technical interview discussions.

---

## 🛠️ Technologies Used
- Java (Core Java)
- Object-Oriented Programming (OOP)
- Console-based input/output

---

## 📂 Project Structure

ATMProject/

│

├── Account.java // Abstraction + Encapsulation

├── SavingsAccount.java // Inheritance + Polymorphism

├── ATMService.java // ATM business logic

└── Main.java // Program execution and user interaction

---

## 🧠 OOP Concepts Implemented

| Concept | Description |
|------|-------------|
| Encapsulation | Private PIN and balance with controlled access |
| Abstraction | Abstract `Account` class |
| Inheritance | `SavingsAccount` extends `Account` |
| Polymorphism | Overridden `withdraw()` method |

---

## ⚙️ Features
- PIN authentication with limited attempts
- Balance inquiry
- Deposit with validation
- Withdrawal with insufficient balance handling
- Mini statement (stores last 5 transactions)
- Exception handling for invalid user input
- Menu-driven console interface

---

## ▶️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ATMProject.git

2. Open the project in any Java IDE (Eclipse / IntelliJ / VS Code).

3. Compile and run Main.java.

4. Enter the PIN when prompted.

5. Default PIN: 1234 and Initial Balance: 10000 (later values hardcoded can be changed in code if required)

---

## 🚫 Limitations

- Supports only a single user account

- Console-based application (no GUI or web interface)

- No database or persistent storage

- Basic security (PIN is not encrypted)

---

## 🔮 Future Enhancements

- Support for multiple user accounts

- Database integration for persistent storage

- PIN hashing for improved security

- Web or GUI-based frontend

- Concurrent user handling

---

## 🎯 Learning Outcomes

Practical understanding of Core Java fundamentals

Implementation of all major OOP concepts

Input validation and exception handling

Writing clean, modular, and interview-ready code

