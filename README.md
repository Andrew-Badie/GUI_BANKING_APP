# JavaFX Bank Application

An educational desktop application by Andrew Badie using Java, JavaFX, FXML, and local text-file storage.

Manager and customer screens demonstrate account creation/deletion, deposits, withdrawals, purchases, and balance checks. The original controllers and FXML are preserved; a launcher and Maven configuration have been added to make setup explicit.

## Requirements

- JDK 21
- Maven 3.9 or later
- A desktop graphical session on Windows, macOS, or Linux
- Internet access for the initial Maven dependency download

JavaFX 21.0.2 is declared in the POM. A separate JavaFX SDK installation or IDE module-path setup is not required for the Maven launch command.

## Build and run

```bash
git clone https://github.com/Andrew-Badie/Object_Oriented_Bank_Application.git
cd Object_Oriented_Bank_Application
java -version
mvn -version
mvn clean compile
mvn javafx:run
```

Check that both version commands identify JDK 21. Maven launches `hellofx.BankApplication`, which loads the login view from `/hellofx/hellofx.fxml`.

These instructions require the launcher/build-configuration update. They were checked against the source layout but **have not yet been build-tested or GUI-tested**.

## Demo walkthrough

Use synthetic data only.

1. Start the application. Enter username `admin`, password `admin`, and role `manager`. These are fixed educational demo credentials.
2. Create a customer named `demo_customer` with a disposable password. The initial balance is 100.
3. Log out, then log in using those customer credentials and role `customer`.
4. In the customer screen, enter the same credentials in the confirmation fields.
5. Select Get Balance, deposit 50, and check for a balance of 150.
6. Withdraw 20 and check for a balance of 130.
7. Use a purchase of 50 to explore purchase fees; for a Silver account the current code charges an additional 20.
8. Log out and close the application.

This is a suggested manual check, not a record of tests already passed.

The program writes a file named after the customer in the process working directory (normally the repository root when launched as above). Use `demo_customer` for this walkthrough; do not use filenames, paths, or real personal data as usernames. The demo file is ignored by Git. Close the application before deleting it to reset the demonstration.

## Source layout

```text
pom.xml
src/main/java/hellofx/
    BankApplication.java    JavaFX launcher
    Controller.java         Login and navigation
    Controller2.java        Manager actions
    Customer.java           Customer actions
src/main/resources/hellofx/
    hellofx.fxml             Login view
    hellofx2.fxml            Manager view
    addCustomer.fxml        Customer view
```

FXML resources share the controllers' package path so the existing relative resource lookups continue to work.

## Design and limitations

Controllers handle interface events and read/write local text records. Customer levels are determined by balance: Silver below 10,000, Gold from 10,000 to under 20,000, and Platinum from 20,000. Purchase fees are 20 for Silver and 10 for Gold, with no additional fee for Platinum.

This is a coursework demonstration, not a production banking system. It uses plaintext local records and demo authentication. Input validation, file handling, and transaction logic need further work: nonnumeric amounts can raise exceptions, usernames are used directly as file paths, and purchases require a positive remaining balance. There is no automated test suite yet.

## Portfolio demonstration

After completing the manual walkthrough, capture the login, manager, and customer screens using the demo account. A short recording can show account creation, a deposit, a withdrawal, and the updated balance. No screenshots or successful test results are claimed by this update.

## Troubleshooting

- If `mvn` is not recognized, install Maven and add its executable directory to PATH.
- If Maven reports an unsupported Java release, configure JAVA_HOME/PATH for JDK 21 and check `mvn -version` again.
- A graphical display is required; compilation alone does not validate JavaFX screens.
- Run Maven from the directory containing `pom.xml`.
