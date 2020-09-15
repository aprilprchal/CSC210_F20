## Lab1 Bank Accounts
### Complex Objects
#### DUE: Tuesday, September 22 before Lab
#### Zip all files and submit via Moodle

> Your goal for Tuesday lab is to compile and execute _Main.java_. This does not mean you have the lab complete, nor does it mean that the tests have to be passing. It means you have to create `class Checking` and `class Discover` with constructors and "stubs" for the methods (stubs described under Assessment section).

**CHECK YOUR WORK WITH Dr. LARSON BEFORE YOU LEAVE TO GET CREDIT FOR PARTICIPATION IN THE LAB.**

> Late submissions will be accepted up to 2 days after the deadline with a maximum of 50% credit. For this lab, it means that I will accept submissions until Thursday, September 24 at 10:00pm. It is most likely to your benefit to submit what you have at the deadline, even if it is not complete!

<hr>

Learning Outcomes:

1. Given functional requirements and minimal code base, you can build classes to meet functional requirements.
2. Use the given (minimal) testing script to ensure code is executable.
3. For derived classes, you understand access to methods and member variables.

<hr>

General Requirements:

1. Create the classes Checking and Discover.
3. Document all code with Javadocs.
4. Modify class Account to meet requirements.
5. Create Transaction class and incorporate into Account.

<hr>

Provided Files:

- Account.java : The base class for bank accounts.
- Credit.java : The interface for a credit account (e.g. credit card)
- Debit.java : The interface for a debit account (e.g. checking account)
- TestLab0.java : The class that provides main(), the entry point for execution.

<hr>

Assessment:

Complete the following to earn up to a C
- 20% : complete, compiles, and executes without throwing exception
- 10% : javadocs
- 25% : `class Checking` requirements
- 25% : `class Discover` requirements
- 10% : modification of `Account` for fees and interest rates
- 10% : `class Transaction` requirements

> To be graded, the main() method in TestLab0 must compile and execute without throwing an exception. Note that this does not mean you have to get the lab complete and perfect. It means that for every method called in main, you should have that method defined, even if it is empty and not doing anything. An empty method is called a "_stub_", which is a placeholder for future code (but is still executable). It is common to start a project by creating a stub for all the methods.

<hr>

### 1. Create `class Checking`

Define the `class Checking` in the file _Checking.java_ as a subclass of `class Account` that implements the `interface Debit`. Overload the constructor using these 2 signatures:

```java
public Checking(String name, Double startBalance);
public Checking(String name);
```

The `Checking(String name)` should have **only 1 line of code**. That one line is `this(name,0);`. What that one line will do is call the other constructor.

The `Checking(String name, double startBalance)` constructor should call the parent class constructor (i.e. _Account_) like this: `super(name);`.

You will need to initialize member variables in the constructor. It should have a **default minimum balance limit of $0.00 and fee of $5.00**, which is a monthly service fee. Additionally, the initial balance needs to be set.

> NOTICE that the Account member variables are private (not protected). Do NOT change this because it is a safety measure. To access or modify these variables, use the setters and getters.

For easy printing, add the below `toString()` method (notice it is using the _toString()_ method of the super class _Account_ within its toString method):

  ```java
  public String toString() {
    return "Checking "+super.toString();
  }
  ```

You must implement all methods declared in the interface _Debit_. For each, change the balance as appropriate for the transaction.

**ADD JAVADOCS** as you are writing the class. Include documentation for member variables and class methods. This is the easiest way to document your code, as opposed to writing all your code then, as an afterthought, go back and fill in the documentation.

### 2. Create `class Discover`

Essentially repeat the above process for _Discover_. The class _Discover_ is a subclass of _Account_ and it uses the _Credit_ interface. Create 2 constructors as you did for _Checking_.

```java
public Discover(String name, Double startBalance);
public Discover(String name);
```

You will need to initialize member variables in the constructor. They should have a **default maximumBalanceLimit of $2000.00**, a **default fee of $30.00**, which is an annual membership fee, and if no balance is provided, then a **default starting balance of $0.00**. Set the balance limit and fee in the constructor.

For easy printing, add this `toString()` method (notice it is using the _toString()_ method of the super class _Account_ within its toString method):

  ```java
  public String toString() {
    return "Discover "+super.toString();
  }
  ```

You must implement all methods declared in the interface. For each, set the balance as appropriate for the transaction.

> **Remember that the Credit balance reflects how much the owner of the account owes the bank. Purchases increase the balance while payments decrease it.**

**ADD JAVADOCS** as you are writing the methods. This is the easiest way to document your code.

<hr>

### 3. OOPS -- chargeFee() Not Right

Charging a fee to a checking (debit) account decreases the balance, but charging a fee to a Discover (credit) account increases the balance. Override `chargeFee()` in both Discover and Checking and adjust the balance as appropriate.

> At this point, you can start to understand the complexity of creating a base class Account for both credit and debit accounts, and perhaps the design needs some adjustment (but not now). _This is the nature of coding_: at a high level, the code makes sense, but when we get down into the details, we run into unanticipated problems and complexities.

<hr>

### 4. Create interestRate Account Member Variable

The interest rate is hardcoded into the method `applyInterest()` with the statement:

```
changeBalanceByAmount(balance*.182/12);
```

Interest rates are defined annually, but applied monthly, hence it is divided by 12. For credit accounts, this is a charge that increases the balance (because now the owner owes more to the bank) but for debit accounts, this is earned interest (like with savings accounts) yet it also increases the balance. (_Isn't that funny that when you borrow money from the bank they think you should pay them 15-20% interest, but if you lend money to the bank, which is exactly what you are doing because they invest your money while they are "holding" it for you in your savings account, they think they should pay you 1-2% interest._ ) Anyway, back to the problem at hand ...

Hard coding values is typically not good practice. Fix that by creating an `interestRate` member variable in _class Account_. The default for Checking is 0%. The default for Visa is 18.2%, expressed as .182.

<hr>
<hr>

### 5. Create _class Transaction_

Banks keep track of all transactions so that they can be reviewed. Add this functionality to the _Account_ class by defining a _Transaction_ class INSIDE the Account class (yes, you can do that!). Follow the instructions below.

- Import the packages `java.time.LocalDate` and `java.util.ArrayList` into the _Array_ class.

- Create a simple Transaction class within the Account class that has 3 member variables: `description`, `amount`, and `date`. The description should indicate the type of transaction: "purchase", "withdrawal", "payment", or "deposit".

  ```
  private class Transaction {
    private String description;
    private double amount;
    private LocalDate date;
    Transaction(String desc, double dollars) {
      description = desc;
      amount = dollars;
      date = LocalDate.now();
    }
  } // end class Transaction
  ```

Add `Transaction.toString()`
   ```
	  public String toString() {
	    return String.format("%s $%8.2f %s",date,amount,description);
	  }
	  ```

- Create a member variable `transactions` in Account
  ```
  protected ArrayList<Transaction> transactions = new ArrayList<>()
  ```

- Wherever you make a transaction (e.g. deposit, withdrawal, etc.) in Checking or Discover, create a corresponding transaction and add to the transactions list. For example, if you make a withdrawal of $40.00, you would want to add `new Transaction("withdrawal",40)` to your _transactions_ array.

- Add a method `Account.printTransactions()` to print the transaction list. Print a heading first that includes account information. You can use the `toString()` method of Account for this. For example, the heading might look like:
  _Transactions for Account 23610002 (Annika Haas) $150.00_.

Lab Is Complete!
