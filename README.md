# Java ATM Simulation

**Author:** Kyame Israel  
**Course:** Java OOP / College Project  
**Date:** February 2026  

## Overview
This project is a simple simulation of an ATM machine built in **Java** to demonstrate **object-oriented programming principles** such as classes, methods, encapsulation, and data validation. Users can interact with the ATM to deposit, withdraw, check balance, and exit securely with PIN authentication.  

## Features
- **Account creation with validation** for:  
  - Name (letters only)  
  - Account number (digits only)  
  - PIN (exactly 4 digits)  
  - Balance (cannot be negative)  
- **Authentication:** Users must enter their account number and correct PIN to access the ATM.  
- **Main Menu:** Options for deposit, withdrawal, balance check, and exit.  
- **Transaction Validation:** Ensures deposit and withdrawal amounts are positive and withdrawals do not exceed available balance.  
- **Secure Data Handling:** Account PINs are private, and operations validate inputs to prevent invalid actions.  

## Project Structure
src/
├── Main.java
│   └─ Entry point for the program
├── Account.java
│   └─ Stores individual account information and manages transactions
├── Bank.java
│   └─ Manages multiple accounts using HashMap
├── Machine.java
│   └─ ATM machine logic: card insertion, authentication, menu navigation
└── UserValidator.java
    └─ Static methods for input validation

## How to Run
1. **Compile all `.java` files:**
```bash
javac *.java
java Main

Welcome to the Java ATM!
------------------------
Insert your credit/debit card (input account number):
> 123456
Enter your PIN Number:
> 1234
Main Menu
---------
1. Deposit
2. Withdraw
3. Balance
4. Exit
