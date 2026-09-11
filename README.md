# JavaFX Bank Application

A Java desktop banking application I built as an object-oriented programming project using **Java, JavaFX, and FXML**.

The application has separate manager and customer flows, stores customer information locally in text files, and supports basic banking operations such as deposits, withdrawals, purchases, and balance checks.

## Features

### Manager

- Log in through the manager role
- Create customer accounts
- Delete customer accounts
- Manage locally stored customer records

### Customer

- Log in with a username and password
- View the current account balance
- Deposit money
- Withdraw money while preventing the balance from going below zero
- Make purchases with account-level rules
- Log out through the JavaFX interface

The application also assigns customer levels based on balance:

- **Silver:** below $10,000
- **Gold:** $10,000 to under $20,000
- **Platinum:** $20,000 or more

The purchase logic applies different fees depending on the customer's level.

## Technologies

- Java
- JavaFX
- FXML
- File I/O (`FileReader`, `FileWriter`, `BufferedReader`)
- Object-oriented programming

## Main files

```text
Controller.java      Login and role-based navigation
Controller2.java     Manager account-management actions
Customer.java        Customer banking operations and business rules
hellofx.fxml         Login interface
hellofx2.fxml        Manager interface
addCustomer.fxml     Customer banking interface
```

## How it works

Customer records are stored in local text files. The program reads those files when a customer logs in or performs an operation and writes the updated balance and account level back to the file after a successful transaction.

The GUI is built with JavaFX and FXML, with controller classes handling the user actions for the different screens.

## Running the project

This project requires a Java installation with JavaFX configured. Open the project in a Java IDE with JavaFX support, keep the Java source and FXML resources available to the `hellofx` package, and run the application's JavaFX entry point.

Because JavaFX setup differs by JDK and IDE, the exact VM/module configuration may need to be adjusted for your environment.

## Project note

This was an educational OOP project and is **not intended to be a production banking system**. It uses local text-file storage and simple demo authentication rather than a database, encrypted credential storage, or a production security model.
