# Banking System Console Application

A menu-driven **Banking System developed using Java** that simulates basic banking operations through a console interface.

## Features

- Create a bank account at startup
- Deposit money
- Withdraw money
- Check account balance
- View account details
- Validate user input
- Prevent deposits and withdrawals with non-positive amounts
- Prevent withdrawals exceeding the available balance
- Display updated balances after transactions

## Technologies Used

- **Language:** Java
- **Input Handling:** Scanner
- **Concepts:** Object-Oriented Programming (OOP), encapsulation, classes, objects, methods, loops, conditional statements, and switch statements

## Project Structure

```text
Banking-System/
├── BankingSystem.java
└── README.md
```

## How to Run

1. Install the Java Development Kit (JDK).
2. Download or open this repository.
3. Open `BankingSystem.java` in a Java IDE.
4. Run the `BankingSystem` class.
5. Enter the account details and select operations from the menu.

## Sample Output

```text
=====================================
       WELCOME TO BANKING SYSTEM
=====================================
Enter account holder name: Rahul
Enter account number: 123456
Enter initial deposit: 5000

Account created successfully!

============== MAIN MENU ==============
1. Deposit Money
2. Withdraw Money
3. Check Balance
4. View Account Details
5. Exit
=======================================
Enter your choice: 1
Enter deposit amount: 1000
Amount deposited successfully!
Updated balance: 6000.00
```

## Concepts Demonstrated

- Classes and objects
- Encapsulation using private fields
- Constructors and methods
- Conditional statements and loops
- User input validation
- Basic transaction logic

## Limitations

This is an educational console application, not a real banking system. Account information and transactions are stored only in memory and are lost when the application exits. It does not include authentication, a database, transaction history, or real financial services.

## Future Enhancements

- Multiple bank accounts
- PIN-based authentication
- Transaction history
- File or database storage
- Transfer money between accounts
- A graphical user interface

## License

For educational and learning purposes.
