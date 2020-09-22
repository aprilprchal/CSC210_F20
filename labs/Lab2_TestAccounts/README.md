## Lab2 Unit Testing of Bank Accounts
#### DUE: Tuesday, September 29 before Lab
#### Zip all files and submit via Moodle

> Your goal for Tuesday lab is to complete the unit tests for Checking. BUT FIRST, if you have not completed Lab 1, then your goal for lab today is to first get that finished, then work on the unit tests.

**CHECK YOUR WORK WITH Dr. LARSON BEFORE YOU LEAVE TO GET CREDIT FOR PARTICIPATION IN THE LAB.**

> Late submissions will be accepted up to 2 days after the deadline with a maximum of 50% credit. For this lab, it means that I will accept submissions until Thursday, October 1 at 10:00pm (_is it really October next week, yikes!_). It is most likely to your benefit to submit what you have at the deadline, even if it is not complete!

<hr>

Learning Outcomes:
1. Given a class, be able to design and implement unit tests.
2. Given unit tests, be able to use them to ensure code correctness.

<hr>

General Requirements:

1. Complete the tests in TestChecking.java
3. Create a new test file TestDiscovery.java for unit testing class Discovery.
4. Make minor adjustments to the Lab1 code (as specified in directions below).
5. Run tests against code and make corrections so that all tests pass.

_Javadocs_ is not required for testing, but please use good naming conventions and descriptive, informative error messages in your asserts.

<hr>

Assessment:

- 18% : complete, compiles, and executes without throwing exception
- 40% : `class testChecking` requirements
- 40% : `class testDiscover` requirements
- 02% : modification of `Account` for fees

> To be graded, the unit test files must compile and execute. This means your Account, Checking, and Discover classes must compile and execute.

<hr>

Start by _pulling_ the code from GitHub (if you have that setup) OR using the download option on GitHub OR copying and pasting code from GitHub onto your machine. If you download, you will again download the entire contents of the repository -- you cannot select a single file or folder for download.

Add YOUR completed Lab1 to the Lab2 folder.

<hr>

### 1. Complete assertEquals()

There are 2 `assertEquals()` methods (i.e. it is _overloaded_). They are almost complete, but the if-statement needs to be filled in. You are testing if the expected is NOT equal to the results.

### 2. Complete unit tests in TestChecking.java

In every method that has been defined in _TestChecking.java_, you will see directions for the required tests. Look for this in the code to indicate what needs doing:

`// @@@@@@@@@@@@@ WRITE THIS`

Don't forget to write a "visual inspection" test for transactions. This means you print something out (probably using `printTransactions()` that you can check if it is correct. As part of the printout, indicate what you expect to see listed in transactions so that anyone running the test can just look at the report and know if it is working or not.

### 3. Charging Fees

While working on the unit tests, "we" realized that the fee might put the account over its balance limit (either below minimum or above maximum). This is a problem, because the bank needs to charge those fees, BUT you cannot directly set the balance in the Checking and Discover classes, because the balance is private to the Account. 

Make an additional _chargeFee_ method in Account with an input parameter specifying the amount. From chargeFee in the Checking and Discover accounts, call the Account chargeFee. Make sure you get the sign right! Debit fees decrease the balance and Credit fees increase it. This Account method will change the balance regardless of putting the account under or over its limit.

### 4. Repeat Unit Tests for TestDiscover.java

Create a new file TestDiscover.java. Model the file after TestChecking.java including the 2 assert methods and a test function for each method in the Discover class. _You can probably start by copying TestChecking.java and find-replace "Checking" with "Discover."

<hr>

### 5. Test and Fix Your Code

Run your tests against Checking and Discover. You should not see anything printed except for the messages indicating what is being tested and the transactions for visual inspection. If you see any error messages from your assert methods, fix your code.

Lab Is Complete!
