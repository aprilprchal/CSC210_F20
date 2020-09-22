/** Test Harness for class Checking. All methods and constructors unit tested.
*/
public class TestChecking {
	/* 
	Checking methods include:
	- public Checking(String name, Double startBalance);
	- public Checking(String name);
	- public void chargePurchase(Double amount);
	- public void cashWithdrawal(Double amount);
	- public void makeDeposit(Double amount);
	- public void chargeFee();
	- public void applyIntereste();
	- also test balance limits and creation of transactions.
	*/

	// Javadocs is not necessary for tests. 
	// But do make sure you use good naming conventions and informative error msgs

	public static void assertEquals(
		Double expect, Double result, Double threshold, String msg) {
		if (/* FILL THIS IN -- use absolute value */) {
			System.out.println(msg+" Expect "+expect+". Result "+result);
		}
	}
	public static void assertEquals(String expect, String result, String msg) {
		if (/* FILL THIS IN -- use compareTo for strings */)) {
			System.out.println(msg+" Expect "+expect+". Result "+result);
		}
	}

	public static void main(String[] args) {
		// I call testing the constructors the "sanity check".
		// No point in testing anything else until the constructors are working
		// because most tests rely on default values being correct.
		testConstructor();
		testCashWithdrawal();
		testChargePurchase();
		testMakeDeposit();
		testChargeFee();
		testApplyInterest();
		testBalanceLimit();
		testTransactions();
	} // end main()

	public static void testConstructor(){
		// constructor Checking(String name)
		// name is name
		// default balance $0, default fee $5, def interest .06
		// default minBalanceLimit $0, def maxBalanceLimit $0, 

		System.out.println("\n\nTesting Checking class constructors ...");

		Checking judy = new Checking("Judy Stein");
		assertEquals("Judy Stein",judy.name(),"Constructor 1.");
		assertEquals(0.0,judy.balance(),"Constructor 1 start bal.");
		assertEquals(
			0.0,judy.minimumBalanceLimit(),0.0,"Constructor 1 def min limit.");
		assertEquals(5.0,judy.fee(),0.0,"Constructor 1 default bal.");
		assertEquals(.06,judy.interestRate(),0.0,"Constructor 1 default interest.");

		Checking omar = new Checking("Aden Omar",200.0);
		assertEquals("Aden Omar",omar.name(),"Constructor 2.");
		assertEquals(200.0,omar.balance(),"Constructor 2 start bal.");
		assertEquals(
			0.0,omar.minimumBalanceLimit(),0.0,"Constructor 2 def min limit.");
		assertEquals(5.0,omar.fee(),0.0,"Constructor 2 default bal.");
		assertEquals(.06,omar.interestRate(),0.0,"Constructor 2 default interest.");

	}

	public static void testCashWithdrawal() {
		System.out.println("\n\nTesting Checking.cashWithdrawal() ...");

		// Write tests that do not violate the minimum or maximum balance limit.
		// For checking, this means nothing that would result in a negative balance.
		Checking annika = new Checking("Annika Haas",100.0);

		double balance = annika.balance();
		double cash = balance/2.0;

		annika.cashWithdrawal(cash);
		assertEquals(balance/2.0,annika.balance(),0.0,"Withdrawal half.");

		// @@@@@@@@@@@@@ WRITE THIS
		// write a test to withdraw current balance (i.e. draw down to a $0 balance)

	}

	public static void testChargePurchase() {
		System.out.println("\n\nTesting Checking.chargePurchase() ...");

		// Write tests that do not violate the minimum or maximum balance limit.
		// For checking, this means nothing that would result in a negative balance.
		
		// @@@@@@@@@@@@@ WRITE THIS
		// Write 2 tests here -- essentially the same as cashWithdrawal

	}

	public static void testMakeDeposit() {
		System.out.println("\n\nTesting Checking.makeDeposit() ...");

		Checking annika = new Checking("Annika Haas");	// 0.0 balance

		double balance = annika.balance();
		annika.cashMakeDeposit(100.00);
		assertEquals(balance+100.0,0.0,"Deposit $100 into $0.");

		// @@@@@@@@@@@@@ WRITE THIS
		// Write another test to deposit when balance is not at $0

	}

	public static void testChargeFee() {
		System.out.println("\n\nTesting Checking.chargeFee() ...");
		
		Checking omar = new Checking("Aden Omar",5.0);
		omar.chargeFee();
		assertEquals(0.0,omar.balance(),0.0,"Charge fee from $5.");

		// set balance to $0, regardless of its current value, charge fee
		omar.changeBalanceByAmount(-omar.balance());
		omar.chargeFee();
		assertEquals(-5.0,omar.balance(),0.0,"Charge fee from $0.");
		// hmmm. balance limit will not allow this.
		// But we know banks are happy to go below $0 and charge overdraft :-)
		// Through testing, we found contradicting requirements.
		// @@@@@@@@@@@@@ REWRITE ABOVE after creating new chargeFee(amount) in Account

		// @@@@@@@@@@@@@ WRITE THIS
		// write one more test that results in a balance > $0
		// maybe you want this one first and start with more money in the account.
	}

	public testApplyInterest() {
		System.out.println("\n\nTesting Checking.applyInterest() ...");

		Checking cruz = new Checking("Poppie Cruz",100.0);
		double rate = cruze.interestRate();
		cruz.applyInterest();
		assertEquals(100+100.0*rate/12.0,cruz.balance(),0.0001,"Apply interest to $100.");

		// @@@@@@@@@@@@@ WRITE THIS
		// write a test to apply interest to $0 balance

	}

	public testBalanceLimit() {
		
		Checking cruz = new Checking("Poppie Cruz",100.0);
		cruz.cashWithdrawal(105.00);
		assertEquals(100.00,cruz.balance(),0.0,"Withdraw over balance.");

		// @@@@@@@@@@@@@ WRITE THIS
		// write another test to chargePurchase > balance.

	}

	public testTransactions() {

		// @@@@@@@@@@@@@ WRITE THIS
		/* 
		Write tests to confirm that a cash withdrawal, purchase, and deposit 
		create transactions and put them into the transactions array in Account.
		This test can be a visual inspection of the results.
		*/
	}
} // end class TestChecking
